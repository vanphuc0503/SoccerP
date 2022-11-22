package com.vanphuc.sockerp.data.repository.standing

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.StandingItem
import com.vanphuc.sockerp.ui.common.BaseResponse

interface StandingRepository {
    suspend fun getStandings(
        leagueId: Int
    ): GenericResponse<BaseResponse<List<StandingItem>>>
}