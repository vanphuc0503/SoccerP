package com.vanphuc.sockerp.data.repository.standing

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.StandingItem
import com.vanphuc.sockerp.data.source.remote.soccer.StandingApi
import com.vanphuc.sockerp.ui.common.BaseResponse
import javax.inject.Inject

class StandingRepositoryImpl @Inject constructor(
    private val standingApi: StandingApi
) : StandingRepository {

    override suspend fun getStandings(leagueId: Int): GenericResponse<BaseResponse<List<StandingItem>>> =
        standingApi.getStandings(leagueId)

}