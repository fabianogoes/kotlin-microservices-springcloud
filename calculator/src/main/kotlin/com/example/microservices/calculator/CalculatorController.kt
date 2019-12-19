package com.example.microservices.calculator

import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
@RequestMapping("/")
class CalculatorController(val service: CalculatorService) {

    @GetMapping
    fun get() = ResponseEntity.ok(service.getCalc())

}