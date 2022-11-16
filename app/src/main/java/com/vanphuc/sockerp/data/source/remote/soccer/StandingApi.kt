package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.model.BaseResponse
import com.vanphuc.sockerp.data.model.StandingItem
import retrofit2.http.GET
import retrofit2.http.Query

interface StandingApi {

    @GET("?action=get_standings")
    suspend fun getStandings(
        @Query("league_id") leagueId: Int
    ): BaseResponse<List<StandingItem>>
}