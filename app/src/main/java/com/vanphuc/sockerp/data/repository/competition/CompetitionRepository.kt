package com.vanphuc.sockerp.data.repository.competition

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Competitions
import com.vanphuc.sockerp.data.model.Country
import com.vanphuc.sockerp.ui.common.BaseResponse

interface CompetitionRepository {
    suspend fun getCompetitions(): GenericResponse<BaseResponse<List<Competitions>>>
}