package com.vanphuc.sockerp.data.usecase.country

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Lineup
import com.vanphuc.sockerp.data.source.remote.soccer.LineupApi
import com.vanphuc.sockerp.domain.UseCase
import javax.inject.Inject

class GetLineupByMatchIDUseCase @Inject constructor(
    private val lineupApi: LineupApi
) : UseCase<GenericResponse<List<Lineup>>, Int>() {

    override suspend fun run(params: Int): GenericResponse<List<Lineup>> {
        return lineupApi.getLineups(params)
    }
}