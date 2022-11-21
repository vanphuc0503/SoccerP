package com.vanphuc.sockerp.data.repository.statistic

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Statistics

interface StatisticRepository {
    suspend fun getStatistics(
        match_id: Int
    ): GenericResponse<Statistics>
}