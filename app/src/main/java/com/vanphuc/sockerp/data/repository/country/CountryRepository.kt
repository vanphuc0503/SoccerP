package com.vanphuc.sockerp.data.repository.country

import com.vanphuc.sockerp.data.BaseResponse
import com.vanphuc.sockerp.data.model.Country

interface CountryRepository {
    suspend fun getCountries(): BaseResponse<List<Country>>
}