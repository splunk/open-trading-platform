FROM golang:1.22

ADD . /app

WORKDIR /app

RUN go build -o service
RUN go test ./...
RUN go vet ./... 

CMD /app/service
