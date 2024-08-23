FROM golang:1.21

ADD . /app

WORKDIR /app

RUN go build -o service-auth
RUN go test ./...
RUN go vet ./... 

CMD /app/service-auth
