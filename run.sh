#!/bin/bash

clear
sudo docker-compose down

cd discovery && mvn clean package && cd ..
cd configserver && mvn clean package && cd ..
cd calculator && mvn clean package && cd ..
cd simulation && mvn clean package && cd .. 
cd gateway && mvn clean package && cd ..

sudo docker-compose down && sudo docker-compose up -d --build && sudo docker-compose logs -f
