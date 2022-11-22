package com.vanphuc.sockerp.data.repository.lineup

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Lineup
import com.vanphuc.sockerp.ui.common.BaseResponse

interface LineupRepository {
    suspend fun getLineup(
        matchId: Int
    ): GenericResponse<BaseResponse<List<Lineup>>>
}