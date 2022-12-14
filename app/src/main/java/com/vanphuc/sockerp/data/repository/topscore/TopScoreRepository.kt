package com.vanphuc.sockerp.data.repository.topscore

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Competitions
import com.vanphuc.sockerp.data.model.Match
import com.vanphuc.sockerp.ui.common.BaseResponse
import retrofit2.http.Query

interface TopScoreRepository {
    suspend fun getTopScore(
        leagueId: Int
    ): GenericResponse<BaseResponse<List<Competitions>>>
}