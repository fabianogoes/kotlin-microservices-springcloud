package com.example.microservices.calculator

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class WelcomeController {

    @Value("\${app.configuration.cet.daysInMonth}")
    lateinit var daysInMonth: String

    @Value("\${app.configuration.cet.daysInYear}")
    lateinit var daysInYear: String

    @GetMapping
    fun get() = "daysInMonth = $daysInMonth - daysInYear = $daysInYear"

}