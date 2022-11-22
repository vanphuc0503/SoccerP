package com.vanphuc.sockerp.data.usecase.country

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Lineup
import com.vanphuc.sockerp.data.source.remote.soccer.LineupApi
import com.vanphuc.sockerp.domain.UseCase
import com.vanphuc.sockerp.ui.common.BaseResponse
import javax.inject.Inject

class GetLineupByMatchIDUseCase @Inject constructor(
    private val lineupApi: LineupApi
) : UseCase<GenericResponse<BaseResponse<List<Lineup>>>, Int>() {

    override suspend fun run(params: Int): GenericResponse<BaseResponse<List<Lineup>>> {
        return lineupApi.getLineups(params)
    }
}