package com.vanphuc.sockerp.data.repository.statistic

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Statistics
import com.vanphuc.sockerp.ui.common.BaseResponse

interface StatisticRepository {
    suspend fun getStatistics(
        match_id: Int
    ): GenericResponse<BaseResponse<Statistics>>
}