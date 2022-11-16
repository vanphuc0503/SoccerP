package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.model.BaseResponse
import com.vanphuc.sockerp.data.model.Competitions
import retrofit2.http.GET
import retrofit2.http.Query

interface TopScoreApi {

    @GET("?action=get_topscorers")
    suspend fun getTopScore(
        @Query("league_id") leagueId: Int
    ): BaseResponse<List<Competitions>>
}