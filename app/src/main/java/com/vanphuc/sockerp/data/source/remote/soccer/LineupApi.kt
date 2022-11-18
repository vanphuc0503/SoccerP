package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.BaseResponse
import com.vanphuc.sockerp.data.model.Lineup
import retrofit2.http.GET
import retrofit2.http.Query

interface LineupApi {

    @GET("?action=get_lineups")
    suspend fun getLineups(
        @Query("match_id") matchId: Int
    ) : BaseResponse<List<Lineup>>
}