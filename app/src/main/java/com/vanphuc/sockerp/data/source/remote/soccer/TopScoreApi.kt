package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Competitions
import com.vanphuc.sockerp.ui.common.BaseResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface TopScoreApi {

    @GET("?action=get_topscorers")
    suspend fun getTopScore(
        @Query("league_id") leagueId: Int
    ): GenericResponse<BaseResponse<List<Competitions>>>
}