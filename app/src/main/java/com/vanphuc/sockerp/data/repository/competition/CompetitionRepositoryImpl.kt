package com.vanphuc.sockerp.data.repository.competition

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Competitions
import com.vanphuc.sockerp.data.source.remote.soccer.CompetitionApi
import com.vanphuc.sockerp.ui.common.BaseResponse
import javax.inject.Inject

class CompetitionRepositoryImpl @Inject constructor(
    private val competitionApi: CompetitionApi
) : CompetitionRepository {

    override suspend fun getCompetitions(): GenericResponse<BaseResponse<List<Competitions>>> =
        competitionApi.getCompetition()

}