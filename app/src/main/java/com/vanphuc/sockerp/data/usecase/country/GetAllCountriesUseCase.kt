package com.vanphuc.sockerp.data.usecase.country

import com.vanphuc.sockerp.data.BaseResponse
import com.vanphuc.sockerp.data.model.Country
import com.vanphuc.sockerp.data.repository.country.CountryRepository
import com.vanphuc.sockerp.domain.UseCase
import javax.inject.Inject

class GetAllCountriesUseCase @Inject constructor(
    private val countryRepository: CountryRepository
) : UseCase<BaseResponse<List<Country>>, UseCase.None>() {

    override suspend fun run(params: None): BaseResponse<List<Country>> =
        countryRepository.getCountries()
}