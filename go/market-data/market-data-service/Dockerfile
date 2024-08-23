FROM golang:1.21.0

ADD . /app

WORKDIR /app

RUN go build -o market-data-service
RUN go test ./...
RUN go vet ./... 
COPY monitor_service.sh /app/monitor_service.sh
RUN chmod +x /app/monitor_service.sh
#CMD /app/service
# Start the monitoring script instead of directly starting the service
CMD ["/app/monitor_service.sh"]