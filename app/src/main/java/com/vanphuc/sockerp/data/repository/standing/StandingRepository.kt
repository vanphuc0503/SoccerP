package com.vanphuc.sockerp.data.repository.standing

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.StandingItem
import retrofit2.http.Query

interface StandingRepository {
    suspend fun getStandings(
        leagueId: Int
    ): GenericResponse<List<StandingItem>>
}