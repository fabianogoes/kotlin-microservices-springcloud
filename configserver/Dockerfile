FROM openjdk:8-jre
RUN echo "America/Sao_Paulo" > /etc/timezone && dpkg-reconfigure -f noninteractive tzdata
LABEL maintainer="Fabiano Góes <fabianogoes@gmail.com>"
ADD target/*-0.0.1-SNAPSHOT.jar app.jar
ADD wait-for-it.sh wait-for-it.sh
CMD ["java", "-jar", "/app.jar"]
EXPOSE 9090