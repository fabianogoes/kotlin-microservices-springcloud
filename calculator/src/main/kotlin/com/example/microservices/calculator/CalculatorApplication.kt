package com.example.microservices.calculator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CalculatorApplication

fun main(args: Array<String>) {
    runApplication<CalculatorApplication>(*args)
}
