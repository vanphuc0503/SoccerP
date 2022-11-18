package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Statistics
import retrofit2.http.GET
import retrofit2.http.Query

interface StatisticApi {

    @GET("?action=get_statistics")
    suspend fun getStatistics(
        @Query("match_id") match_id: Int
    ): GenericResponse<Statistics>
}