package com.vanphuc.sockerp.data.repository.prediction

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Predictions
import java.util.*

interface PredictionRepository {
    suspend fun getPredictions(
        from: Date,
        to: Date,
        countryId: Int? = null,
        leagueId: Int? = null,
        matchId: Int? = null,
    ): GenericResponse<List<Predictions>>
}