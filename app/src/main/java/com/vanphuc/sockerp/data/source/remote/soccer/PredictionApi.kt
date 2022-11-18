package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.BaseResponse
import com.vanphuc.sockerp.data.model.Predictions
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface PredictionApi {

    @GET("?action=get_predictions")
    suspend fun getPredictions(
        @Query("from") from: Date,
        @Query("to") to: Date,
        @Query("country_id") countryId: Int? = null,
        @Query("league_id") leagueId: Int? = null,
        @Query("match_id") matchId: Int? = null,
    ): BaseResponse<List<Predictions>>
}