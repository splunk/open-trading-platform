#!/bin/bash

SERVICE_PATH="/app/market-data-service"
LOG_FILE="/var/log/service_monitor.log"

# Function to start the service
start_service() {
    echo "$(date): Starting service..." | tee -a "$LOG_FILE"
    $SERVICE_PATH &
    SERVICE_PID=$!
    echo "$(date): Service started with PID $SERVICE_PID" | tee -a "$LOG_FILE"
}

# Function to monitor the service
monitor_service() {
    while true; do
        # Check if the service is running
        if ! kill -0 $SERVICE_PID 2>/dev/null; then
            echo "$(date): Service crashed or stopped. Restarting..." | tee -a "$LOG_FILE"
            start_service
        fi
        sleep 5  # Adjust the sleep time as needed
    done
}

# Start the service initially
start_service

# Monitor the service
monitor_service