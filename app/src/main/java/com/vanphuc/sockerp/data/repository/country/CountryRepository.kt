package com.vanphuc.sockerp.data.repository.country

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Country
import com.vanphuc.sockerp.ui.common.BaseResponse

interface CountryRepository {
    suspend fun getCountries(): GenericResponse<BaseResponse<List<Country>>>
}