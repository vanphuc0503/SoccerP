package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Country
import com.vanphuc.sockerp.ui.common.BaseResponse
import retrofit2.http.GET

interface CountryApi {

    @GET("?action=get_countries")
    suspend fun getCountries(): GenericResponse<BaseResponse<List<Country>>>
}