package com.vanphuc.sockerp.data.repository.h2h

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.H2H

interface H2HRepository {
    suspend fun getH2H(
        firstTeam: String,
        secondTeam: String,
        timeZone: String?
    ): GenericResponse<List<H2H>>
}