package com.vanphuc.sockerp.data.usecase.country

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Country
import com.vanphuc.sockerp.data.repository.country.CountryRepository
import com.vanphuc.sockerp.domain.UseCase
import com.vanphuc.sockerp.ui.common.BaseResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetAllCountriesUseCase @Inject constructor(
    private val countryRepository: CountryRepository
) : UseCase<GenericResponse<BaseResponse<List<Country>>>, UseCase.None>() {

    override suspend fun run(params: None): GenericResponse<BaseResponse<List<Country>>> =
        countryRepository.getCountries()
}