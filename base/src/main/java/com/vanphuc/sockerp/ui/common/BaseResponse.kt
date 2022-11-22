package com.vanphuc.sockerp.ui.common

data class BaseResponse<T : Any>(
    val error: Int? = null,
    val message: String? = null,
    val data: T? = null
)