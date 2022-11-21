package com.vanphuc.sockerp.data.repository.statistic

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Statistics
import com.vanphuc.sockerp.data.source.remote.soccer.StatisticApi
import javax.inject.Inject

class StatisticRepositoryImpl @Inject constructor(
    private val statisticApi: StatisticApi
) : StatisticRepository {

    override suspend fun getStatistics(match_id: Int): GenericResponse<Statistics> =
        statisticApi.getStatistics(match_id = match_id)

}