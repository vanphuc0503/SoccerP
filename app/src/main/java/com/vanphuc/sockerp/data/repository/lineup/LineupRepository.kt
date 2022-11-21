package com.vanphuc.sockerp.data.repository.lineup

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Lineup
import com.vanphuc.sockerp.data.model.Match
import retrofit2.http.Query

interface LineupRepository {
    suspend fun getLineup(
        matchId: Int
    ): GenericResponse<List<Lineup>>
}