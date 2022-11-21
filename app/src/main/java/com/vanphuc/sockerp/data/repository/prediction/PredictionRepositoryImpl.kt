package com.vanphuc.sockerp.data.repository.prediction

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Predictions
import com.vanphuc.sockerp.data.source.remote.soccer.PredictionApi
import java.util.*
import javax.inject.Inject

class PredictionRepositoryImpl @Inject constructor(
    private val predictionApi: PredictionApi
) : PredictionRepository {

    override suspend fun getPredictions(
        from: Date,
        to: Date,
        countryId: Int?,
        leagueId: Int?,
        matchId: Int?
    ): GenericResponse<List<Predictions>> =
        predictionApi.getPredictions(
            from = from,
            to = to,
            countryId = countryId,
            leagueId = leagueId,
            matchId = matchId
        )

}