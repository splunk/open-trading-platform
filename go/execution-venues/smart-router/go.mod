module github.com/ettech/open-trading-platform/go/smart-router

go 1.13

require (
	github.com/ettec/open-trading-platform/go/common v0.0.0
	github.com/ettec/open-trading-platform/go/execution-venues/common v0.0.0
	github.com/ettec/open-trading-platform/go/model v0.0.0
	github.com/google/uuid v1.1.1
	google.golang.org/grpc v1.25.1
	k8s.io/api v0.17.4
	k8s.io/apimachinery v0.17.4
	k8s.io/client-go v0.17.4
)

replace github.com/ettec/open-trading-platform/go/common v0.0.0 => ../../common

replace github.com/ettec/open-trading-platform/go/execution-venues/common v0.0.0 => ../common

replace github.com/ettec/open-trading-platform/go/model v0.0.0 => ../../model
