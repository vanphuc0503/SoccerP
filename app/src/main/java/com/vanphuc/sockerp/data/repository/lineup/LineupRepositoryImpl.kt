package com.vanphuc.sockerp.data.repository.lineup

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Lineup
import com.vanphuc.sockerp.data.source.remote.soccer.LineupApi
import com.vanphuc.sockerp.ui.common.BaseResponse
import javax.inject.Inject

class LineupRepositoryImpl @Inject constructor(
    private val lineupApi: LineupApi
) : LineupRepository {

    override suspend fun getLineup(matchId: Int): GenericResponse<BaseResponse<List<Lineup>>> =
        lineupApi.getLineups(matchId)

}