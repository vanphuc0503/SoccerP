package com.vanphuc.sockerp.data.repository.event

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Match
import retrofit2.http.Query
import java.util.*

interface EventRepository {
    suspend fun getEvents(
        from: Date,
        to: Date,
        timeZone: String?,
        countryId: Int?,
        leagueId: Int?,
        matchId: Int?,
        teamId: Int?
    ): GenericResponse<List<Match>>
}