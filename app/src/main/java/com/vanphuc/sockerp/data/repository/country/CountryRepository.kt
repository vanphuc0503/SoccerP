package com.vanphuc.sockerp.data.repository.country

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Country

interface CountryRepository {
    suspend fun getCountries(): GenericResponse<List<Country>>
}