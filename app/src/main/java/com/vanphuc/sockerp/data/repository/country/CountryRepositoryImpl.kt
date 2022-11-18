package com.vanphuc.sockerp.data.repository.country

import com.vanphuc.sockerp.data.BaseResponse
import com.vanphuc.sockerp.data.model.Country
import com.vanphuc.sockerp.data.source.remote.soccer.CountryApi
import javax.inject.Inject

class CountryRepositoryImpl @Inject constructor(
    private val countryApi: CountryApi
) : CountryRepository {

    override suspend fun getCountries(): BaseResponse<List<Country>> =
        countryApi.getCountries()

}