package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.model.BaseResponse
import com.vanphuc.sockerp.data.model.Match
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface EventApi {

    @GET("?action=get_events")
    suspend fun getEvents(
        @Query("from") from: Date,
        @Query("to") to: Date,
        @Query("timezone") timeZone: String? = null,
        @Query("country_id") countryId: Int? = null,
        @Query("league_id") leagueId: Int? = null,
        @Query("match_id") matchId: Int? = null,
        @Query("team_id") teamId: Int? = null
    ): BaseResponse<List<Match>>
}