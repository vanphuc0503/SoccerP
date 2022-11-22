package com.vanphuc.sockerp.data.repository.lineup

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Lineup

interface LineupRepository {
    suspend fun getLineup(
        matchId: Int
    ): GenericResponse<List<Lineup>>
}