package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Teams
import com.vanphuc.sockerp.ui.common.BaseResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface TeamApi {

    @GET("?action=get_teams")
    suspend fun getTeams(
        @Query("team_id") teamId: Int,
        @Query("league_id") leagueId: Int? = null,
    ): GenericResponse<BaseResponse<List<Teams>>>
}