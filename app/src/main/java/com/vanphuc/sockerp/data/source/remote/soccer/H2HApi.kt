package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.H2H
import com.vanphuc.sockerp.ui.common.BaseResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface H2HApi {

    @GET("?action=get_H2H")
    suspend fun getH2H(
        @Query("firstTeam") firstTeam: String,
        @Query("secondTeam") secondTeam: String,
        @Query("timezone") timeZone: String? = null
    ): GenericResponse<BaseResponse<List<H2H>>>
}