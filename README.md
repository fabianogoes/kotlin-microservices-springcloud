# Example Microservices with SpringCloud and Kotlin

This is an example of Microservices using Spring Cloud and Kotlin   

**Stack:**   
- Java `1.8`
- Maven `3`
- Koltin `1.3.61`
- Spring Boot `2`
- Spring Cloud `Hoxton.RELEASE`
- Server Register/Discover `Eureka`
- Spring Cloud `Config Server`
- Api Gateway `Zuul`
- Actuator
- Postam


### References
--------------

- [Spring Cloud][0]
- [Spring Cloud Netflix Eureka][1]
- [Spring Cloud Config][2]
- [Spring REST with a Zuul Proxy][3]
- [Spring Cloud – Bootstrapping](https://www.baeldung.com/spring-cloud-bootstrapping)
- [A Guide to Spring Cloud Netflix – Hystrix](https://www.baeldung.com/spring-cloud-netflix-hystrix)


### Running Local
-----------------

**Required Local Installed** 

- Java 
- Maven
- Docker
- docker-compose

```
./run.sh
```

**Wait for complete boot and verify Eureka UI:** http://localhost:8761   
![Eureka][./docs/eureka-ui.png]


### Test using Postman

> Import Postam Collection `kotlin-microservices-springcloud.postman_collection.json` 

1. HEALTH CHECK GATEWAY
2. HEALTH CHECK CALCULATOR by GATEWAY
3. HEALTH CHECK SIMULATION by GATEWAY
4. GET CALCULATOR by GATEWAY
5. GET SIMULATION by GATEWAY

> Change any calculator's propertie in staging branch through of [config repository](https://github.com/fabianogoes/config-server-repo)

**Execute again in the Postman**

1. POST refresh CALCULATOR by GATEWAY
2. GET SIMULATION by GATEWAY

[0]: https://spring.io/projects/spring-cloud
[1]: https://cloud.spring.io/spring-cloud-netflix/reference/html/
[2]: https://cloud.spring.io/spring-cloud-config/reference/html/
[3]: https://www.baeldung.com/spring-rest-with-zuul-proxy