package com.example.microservices.simulation

data class DefaultResponse<T>(
        val valid: Boolean = true,
        var errors: List<String>? = emptyList(),
        var data: T? = null)