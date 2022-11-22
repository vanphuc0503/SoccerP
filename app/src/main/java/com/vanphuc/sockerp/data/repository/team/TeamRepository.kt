package com.vanphuc.sockerp.data.repository.team

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Teams
import com.vanphuc.sockerp.ui.common.BaseResponse

interface TeamRepository {
    suspend fun getTeams(
        teamId: Int,
        leagueId: Int? = null,
    ): GenericResponse<BaseResponse<List<Teams>>>
}