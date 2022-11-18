package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Country
import retrofit2.http.GET

interface CountryApi {

    @GET("?action=get_countries")
    suspend fun getCountries(): GenericResponse<List<Country>>
}