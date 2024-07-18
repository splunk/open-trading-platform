#!/bin/bash

# Array of services
goservices=(
  "authorization-service"
  "client-config-service"
  "market-data-service"
  "order-data-service"
  "order-monitor"
  "order-router"
  "static-data-service"
)

javaservices=(
  "iexgsimulator"
  "xnassimulator"
)
# Annotation to add
goannotation1='{"spec": {"template":{"metadata":{"annotations":{"instrumentation.opentelemetry.io/inject-go":"true"}}}}}'
goannotation2='{"spec": {"template":{"metadata":{"annotations":{"instrumentation.opentelemetry.io/otel-go-auto-target-exe":"/app/service"}}}}}'
javaannotation='{"spec": {"template":{"metadata":{"annotations":{"instrumentation.opentelemetry.io/inject-java":"default/splunk-otel-collector"}}}}}'

# Loop through each service and apply the kubectl patch command
for service in "${goservices[@]}"; do
  echo "Patching service: $service"
  kubectl patch deployment "$service" -p "$goannotation1"
  kubectl patch deployment "$service" -p "$goannotation2"
done
echo "Go Patching completed."
for service in "${javaservices[@]}"; do
  echo "Patching service: $service"
  kubectl patch deployment "$service" -p "$javaannotation"
done
echo "Java Patching completed."