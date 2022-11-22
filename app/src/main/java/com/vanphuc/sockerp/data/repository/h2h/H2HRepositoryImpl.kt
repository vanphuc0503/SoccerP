package com.vanphuc.sockerp.data.repository.h2h

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.H2H
import com.vanphuc.sockerp.data.source.remote.soccer.H2HApi
import com.vanphuc.sockerp.ui.common.BaseResponse
import javax.inject.Inject

class H2HRepositoryImpl @Inject constructor(
    private val h2HApi: H2HApi
) : H2HRepository {

    override suspend fun getH2H(
        firstTeam: String,
        secondTeam: String,
        timeZone: String?
    ): GenericResponse<BaseResponse<List<H2H>>> =
        h2HApi.getH2H(
            firstTeam = firstTeam,
            secondTeam = secondTeam,
            timeZone = timeZone,
        )
}