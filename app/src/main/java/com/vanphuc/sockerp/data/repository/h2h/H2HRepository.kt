package com.vanphuc.sockerp.data.repository.h2h

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.H2H
import com.vanphuc.sockerp.ui.common.BaseResponse

interface H2HRepository {
    suspend fun getH2H(
        firstTeam: String,
        secondTeam: String,
        timeZone: String?
    ): GenericResponse<BaseResponse<List<H2H>>>
}