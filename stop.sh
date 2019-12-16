#!/bin/bash

echo "Stopping all services..."

sleep 3
sudo kill -9 $(sudo lsof -ti tcp:8761,9090,9091,8080,8081,8082)

echo "Stopped all."
