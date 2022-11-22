package com.vanphuc.sockerp.data

import com.squareup.moshi.Json

data class ErrorResponse(
    @Json(name = "error")
    private val error: Int? = null,
    @Json(name = "message")
    private val message: String? = null
)