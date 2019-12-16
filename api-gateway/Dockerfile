FROM openjdk:8-jre
RUN echo "America/Sao_Paulo" > /etc/timezone && dpkg-reconfigure -f noninteractive tzdata
LABEL maintainer="Fabiano Góes <fabianogoes@gmail.com>"
ADD target/*-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-Xmx64m", "-Xss512k", "-jar", "-Dserver.port=9091", "-Dspring.profiles.active=staging", "/app.jar"]
EXPOSE 9091