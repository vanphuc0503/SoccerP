package com.vanphuc.sockerp.data.repository.statistic

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Statistics
import com.vanphuc.sockerp.data.source.remote.soccer.StatisticApi
import com.vanphuc.sockerp.ui.common.BaseResponse
import javax.inject.Inject

class StatisticRepositoryImpl @Inject constructor(
    private val statisticApi: StatisticApi
) : StatisticRepository {

    override suspend fun getStatistics(match_id: Int): GenericResponse<BaseResponse<Statistics>> =
        statisticApi.getStatistics(match_id = match_id)

}