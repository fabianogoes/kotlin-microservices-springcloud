package com.example.microservices.calculator

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
@RequestMapping("/")
class WelcomeController {

    @Value("\${app.configuration.cet.daysInMonth}")
    lateinit var daysInMonth: String

    @Value("\${app.configuration.cet.daysInYear}")
    lateinit var daysInYear: String

    @Value("\${server.port}")
    lateinit var port: String

    @GetMapping
    fun get() = "daysInMonth = $daysInMonth - daysInYear = $daysInYear - server.port=$port"

}