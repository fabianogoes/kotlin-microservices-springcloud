package com.example.microservices.simulation

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.*


@Service
class SimulationService(val calculatorClient: CalculatorClient) {

    private val logger = LoggerFactory.getLogger(this.javaClass.name)


    @HystrixCommand(fallbackMethod = "defaultResponse")
    fun getCalc(): DefaultResponse<CalculatorDTO>{
        logger.debug("getCalc()...")
        return DefaultResponse(
                valid = true,
                data = calculatorClient.getCalc()
        )
    }

    // When we define a fallback method,
    // the fallback-method must match the same parameters of the method
    // where you define the Hystrix Command using the hystrix-command annotation.
    fun defaultResponse(): DefaultResponse<CalculatorDTO> {
        logger.error("You are seeing this fallback response because the underlying microservice is down.")
        val err = "Fallback error as the microservice is down."
        return DefaultResponse(
                valid = false,
                errors = Collections.singletonList(err)
        )
    }

}