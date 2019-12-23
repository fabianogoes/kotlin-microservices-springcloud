#!/bin/bash

clear
echo "."
echo "."
echo "."
echo "--------------------------------"
echo "Building all services..........."
echo "--------------------------------"
echo "."
echo "."
echo "."
docker volume create --name maven-repo
docker run -it --rm -v "$PWD/discovery":/app -v "$HOME/.m2":/root/.m2 -w /app maven:3.3-jdk-8 mvn clean package
docker run -it --rm -v "$PWD/configserver":/app -v "$HOME/.m2":/root/.m2 -w /app maven:3.3-jdk-8 mvn clean package
docker run -it --rm -v "$PWD/calculator":/app -v "$HOME/.m2":/root/.m2 -w /app maven:3.3-jdk-8 mvn clean package
docker run -it --rm -v "$PWD/simulation":/app -v "$HOME/.m2":/root/.m2 -w /app maven:3.3-jdk-8 mvn clean package
docker run -it --rm -v "$PWD/gateway":/app -v "$HOME/.m2":/root/.m2 -w /app maven:3.3-jdk-8 mvn clean package

echo "."
echo "."
echo "."
echo "--------------------------------"
echo "Running all Services............"
echo "--------------------------------"
echo "."
echo "."
echo "."
sudo docker-compose down && sudo docker-compose up -d --build && sudo docker-compose logs -f
