package com.vanphuc.sockerp.data

data class BaseResponse<T>(
    val data: T? = null,
    val error: Int? = null,
    val message: String? = null
)