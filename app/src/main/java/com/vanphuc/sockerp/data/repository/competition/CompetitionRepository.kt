package com.vanphuc.sockerp.data.repository.competition

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Competitions
import com.vanphuc.sockerp.data.model.Country

interface CompetitionRepository {
    suspend fun getCompetitions(): GenericResponse<List<Competitions>>
}