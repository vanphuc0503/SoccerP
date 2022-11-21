package com.vanphuc.sockerp.data.repository.event

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Match
import com.vanphuc.sockerp.data.source.remote.soccer.EventApi
import java.util.*
import javax.inject.Inject

class EventRepositoryImpl @Inject constructor(
    private val eventApi: EventApi
) : EventRepository {

    override suspend fun getEvents(
        from: Date,
        to: Date,
        timeZone: String?,
        countryId: Int?,
        leagueId: Int?,
        matchId: Int?,
        teamId: Int?
    ): GenericResponse<List<Match>> =
        eventApi.getEvents(
            from = from,
            to = to,
            timeZone = timeZone,
            countryId = countryId,
            leagueId = leagueId,
            matchId = matchId,
            teamId = teamId
        )

}