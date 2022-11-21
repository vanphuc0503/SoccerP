package com.vanphuc.sockerp.data.repository.team

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Teams

interface TeamRepository {
    suspend fun getTeams(
        teamId: Int,
        leagueId: Int? = null,
    ): GenericResponse<List<Teams>>
}