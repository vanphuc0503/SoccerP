package com.vanphuc.sockerp.data.repository.competition

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Competitions
import com.vanphuc.sockerp.data.source.remote.soccer.CompetitionApi
import javax.inject.Inject

class CompetitionRepositoryImpl @Inject constructor(
    private val competitionApi: CompetitionApi
) : CompetitionRepository {

    override suspend fun getCompetitions(): GenericResponse<List<Competitions>> =
        competitionApi.getCompetition()

}