package com.vanphuc.sockerp.data.repository.country

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Country
import com.vanphuc.sockerp.data.source.remote.soccer.CountryApi
import com.vanphuc.sockerp.ui.common.BaseResponse
import javax.inject.Inject

class CountryRepositoryImpl @Inject constructor(
    private val countryApi: CountryApi
) : CountryRepository {

    override suspend fun getCountries(): GenericResponse<BaseResponse<List<Country>>> =
        countryApi.getCountries()

}