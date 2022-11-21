package com.vanphuc.sockerp.data.repository.topscore

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Competitions
import com.vanphuc.sockerp.data.source.remote.soccer.TopScoreApi
import javax.inject.Inject

class TopScoreRepositoryImpl @Inject constructor(
    private val topScoreApi: TopScoreApi
) : TopScoreRepository {

    override suspend fun getTopScore(leagueId: Int): GenericResponse<List<Competitions>> =
        topScoreApi.getTopScore(leagueId)

}