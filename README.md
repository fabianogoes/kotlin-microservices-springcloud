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

- [Spring Cloud Config][0]


### Running Local
-----------------

> Required Local Installed Java and Maven

```
./run
```

> Import Postam Collection `kotlin-microservices-springcloud.postman_collection.json` 

**Test using Postam**   
1. health GATEWAY
2. health CALCULATOR by GATEWAY
3. GET CALCULATOR

> Change any calculator's propertie through of config repository of the calculator app

**Execute again in the Postman**

1. refresh CALCULATOR by GATEWAY
2. GET CALCULATOR

[0]: https://cloud.spring.io/spring-cloud-config/reference/html/