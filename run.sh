#!/bin/bash
clear
PROFILE=staging

APP=discovery-server
cd $APP
mvn clean package
java -Xmx64m -Xss512k -jar -Dserver.port=8761 -Dspring.profiles.active=$PROFILE target/$APP-0.0.1-SNAPSHOT.jar &
cd ..

echo "."
sleep 1
echo ".."
sleep 1
echo "..."
sleep 1

APP=config-server
cd $APP
mvn clean package
java -Xmx64m -Xss512k -jar -Dserver.port=9090 -Dspring.profiles.active=$PROFILE target/$APP-0.0.1-SNAPSHOT.jar &
cd ..

echo "."
sleep 1
echo ".."
sleep 1
echo "..."
sleep 1

APP=api-gateway
cd $APP
mvn clean package
java -Xmx64m -Xss512k -jar -Dserver.port=9091 -Dspring.profiles.active=$PROFILE target/$APP-0.0.1-SNAPSHOT.jar &
cd ..

echo "."
sleep 1
echo ".."
sleep 1
echo "..."
sleep 1
echo "...."
sleep 1
echo "....."
sleep 1

APP=calculator
cd $APP
mvn clean package
java -Xmx64m -Xss512k -jar -Dserver.port=8080 -Dspring.profiles.active=$PROFILE target/$APP-0.0.1-SNAPSHOT.jar &
echo "."
sleep 1
echo ".."
sleep 1
echo "..."
sleep 1
java -Xmx64m -Xss512k -jar -Dserver.port=8081 -Dspring.profiles.active=$PROFILE target/$APP-0.0.1-SNAPSHOT.jar &
echo "."
sleep 1
echo ".."
sleep 1
echo "..."
sleep 1
java -Xmx64m -Xss512k -jar -Dserver.port=8082 -Dspring.profiles.active=$PROFILE target/$APP-0.0.1-SNAPSHOT.jar &

