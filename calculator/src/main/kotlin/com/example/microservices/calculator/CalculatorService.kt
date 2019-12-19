package com.example.microservices.calculator

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class CalculatorService {

    @Value("\${app.configuration.cet.daysInMonth}")
    private lateinit var daysInMonth: String

    @Value("\${app.configuration.cet.daysInYear}")
    private lateinit var daysInYear: String

    @Value("\${server.port}")
    private lateinit var instancePort: String

    fun getCalc(): CalculatorDTO {
        return CalculatorDTO(
                daysInMonth = daysInMonth.toInt(),
                daysInYear = daysInYear.toInt(),
                instance = instancePort.toInt())
    }
}