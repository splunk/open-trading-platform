usage() { echo "Usage: $0 [-v <version number>] [-r <docker repo>] [-m]  where -v is the version number, omit this flag to install latest ci build. -r is the docker repo, omit this flag to use the default repo. -m flag should be used if installing on microk8s  " 1>&2; exit 1; }

DOCKERREPO="ettec"

while getopts ":v:r:m" o; do
    case "${o}" in
        v)
            VERSION=${OPTARG}
            ;;
        m)
            USEMICROK8S="true"
            ;;
        r)
            DOCKERREPO=${OPTARG}
            ;;    
        *)
            usage
            ;;
    esac
done
shift $((OPTIND-1))




TAG=$VERSION
if [ -z "$VERSION" ]; then 
	printf "Installing latest Open Trading Platform build\n"; 
	TAG="latest"
else 
       printf "Installing Open Trading Platform version $VERSION\n"; 
fi

echo installing Open Trading Platform...


helm install --wait --timeout 1200s otp-${VERSION} ../helm-otp-chart/ --set dockerRepo=${DOCKERREPO} --set dockerTag=${TAG}
if [ $? -ne 0 ]; then
   echo "Failed to install open trading platfrom"
   exit 1		
fi


#Instructions to start client
OTPPORT=$(kubectl get svc --namespace=envoy -o go-template='{{range .items}}{{range.spec.ports}}{{if .nodePort}}{{.nodePort}}{{"\n"}}{{end}}{{end}}{{end}}')

echo
echo Open Trading Platform is running. To start a client point your browser at port $OTPPORT and login as trader1 







