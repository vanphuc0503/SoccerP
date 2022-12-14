package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Competitions
import com.vanphuc.sockerp.ui.common.BaseResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CompetitionApi {

    @GET("?action=get_leagues")
    suspend fun getCompetition(
        @Query("country_id") countryId: Int? = null
    ): GenericResponse<BaseResponse<List<Competitions>>>
}