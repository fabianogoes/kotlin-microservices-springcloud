package com.example.microservices.simulation

import org.slf4j.LoggerFactory
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
@RequestMapping("/")
class SimulationController(val service: SimulationService) {

    private val logger = LoggerFactory.getLogger(this.javaClass.name)

    @GetMapping
    fun get(): ResponseEntity<DefaultResponse<CalculatorDTO>> {
        logger.debug("get()...")
        return ResponseEntity.ok(service.getCalc())
    }

}