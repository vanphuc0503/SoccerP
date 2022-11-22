package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.StandingItem
import com.vanphuc.sockerp.ui.common.BaseResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface StandingApi {

    @GET("?action=get_standings")
    suspend fun getStandings(
        @Query("league_id") leagueId: Int
    ): GenericResponse<BaseResponse<List<StandingItem>>>
}