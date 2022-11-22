package com.vanphuc.sockerp.data.repository.team

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Teams
import com.vanphuc.sockerp.data.source.remote.soccer.TeamApi
import com.vanphuc.sockerp.ui.common.BaseResponse
import javax.inject.Inject

class TeamRepositoryImpl @Inject constructor(
    private val teamApi: TeamApi
) : TeamRepository {

    override suspend fun getTeams(teamId: Int, leagueId: Int?): GenericResponse<BaseResponse<List<Teams>>> =
        teamApi.getTeams(
            teamId = teamId,
            leagueId = leagueId
        )

}