package com.vanphuc.sockerp.data.source.remote

import com.vanphuc.sockerp.BuildConfig
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original: Request = chain.request()
        val httpUrl = original.url()
        val url = httpUrl.newBuilder()
            .addQueryParameter("APIkey", BuildConfig.SOCCER_API)
            .build()
        val request: Request = original.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}