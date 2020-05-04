import { Error } from "grpc-web";
import Login from "../components/Login";
import { logError } from "../logging/Logging";
import { Listing } from "../serverapi/listing_pb";
import { StaticDataServiceClient } from "../serverapi/Static-data-serviceServiceClientPb";
import { ListingId } from "../serverapi/static-data-service_pb";



export interface ListingService {

  GetListingImmediate(listingId: number): Listing | null

  GetListing(listingId: number, listener: (
    response: Listing) => void): void
}



export default class ListingServiceImpl implements ListingService {

  staticDataService = new StaticDataServiceClient(Login.grpcContext.serviceUrl, null, null)

  idToListeners: Map<number, Array<(response: Listing) => void>> = new Map()
  listingIdToListing: Map<number, Listing> = new Map()
  pendingListing: Set<number> = new Set()

  
  readonly pendingListingCheckInteral = 5000
  

  constructor() {
    setInterval(()=> {
      if( this.pendingListing.size > 0 ) {
        let pendingListingIds = new Set<number>(this.pendingListing )
        this.pendingListing.clear()
        for(let  listingId of pendingListingIds) {
          this.fetchListing(listingId)
        }
      }
    }, this.pendingListingCheckInteral)
  }


  GetListingImmediate(listingId: number): Listing | null {
    if (listingId <= 0) {
      return null
    }

    let listing = this.listingIdToListing.get(listingId)
    if (listing) {
      return listing
    }

    return null
  }



  GetListing(listingId: number, listener: (
    response: Listing) => void) {

    if (listingId <= 0) {
      return
    }

    let listing = this.listingIdToListing.get(listingId)
    if (listing) {
      listener(listing)
      return;
    }

    let listeners = this.idToListeners.get(listingId)
    if (!listeners) {
      listeners = new Array<(response: Listing) => void>();
      this.idToListeners.set(listingId, listeners)

      this.fetchListing(listingId);
    }

    listeners.push(listener)
  }

  private fetchListing(listingId: number) {
    let listingParam = new ListingId();
    listingParam.setListingid(listingId);
    this.staticDataService.getListing(listingParam, Login.grpcContext.grpcMetaData, (err: Error, listing: Listing) => {
      if (err) {
        logError("get listing for id " + listingId + " failed:" + err);
        this.pendingListing.add(listingId);
        
      }
      else {
        this.listingIdToListing.set(listing.getId(), listing);
        let ls = this.idToListeners.get(listing.getId());
        if (ls) {
          ls.forEach(l => {
            l(listing);
          });
        }
        
      }
    });
  }
}