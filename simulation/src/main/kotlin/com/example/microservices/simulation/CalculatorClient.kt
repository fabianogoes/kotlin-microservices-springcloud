package com.example.microservices.simulation

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "calculator")
interface CalculatorClient {

    @GetMapping("/")
    fun getCalc(): CalculatorDTO

}