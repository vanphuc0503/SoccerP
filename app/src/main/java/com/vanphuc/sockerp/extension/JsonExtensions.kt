package com.vanphuc.sockerp.extension

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi

inline fun <reified T> getObjectFromJson(jsonString: String): T? {
    val moshi = Moshi.Builder().build()
    val jsonAdapter: JsonAdapter<T> = moshi.adapter(T::class.java)
    return try {
        jsonAdapter.fromJson(jsonString)
    } catch (ex: Exception) {
        null
    }
}

inline fun <reified T> getJsonFromObject(data: T): String? {
    val moshi = Moshi.Builder().build()
    val jsonAdapter: JsonAdapter<T> = moshi.adapter(T::class.java)
    return try {
        jsonAdapter.toJson(data)
    } catch (ex: Exception) {
        null
    }
}