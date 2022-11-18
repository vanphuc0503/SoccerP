package com.vanphuc.sockerp.ui.home

import com.vanphuc.sockerp.data.usecase.country.GetAllCountriesUseCase
import com.vanphuc.sockerp.domain.UseCase
import com.vanphuc.sockerp.ui.common.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getAllCountriesUseCase: GetAllCountriesUseCase
) : BaseViewModel() {
    init {
        getAllCountries()
    }

    private fun getAllCountries() {
        networkExecuteTask(
            action = { getAllCountriesUseCase.invoke(UseCase.None) }
        ) {

        }
    }
}