package com.vanphuc.sockerp.ui.news

import com.vanphuc.sockerp.data.usecase.country.GetLineupByMatchIDUseCase
import com.vanphuc.sockerp.ui.common.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val getLineupByMatchIDUseCase: GetLineupByMatchIDUseCase
) : BaseViewModel() {

    init {
        getLineupByMatchID(24562)
    }

    private fun getLineupByMatchID(id: Int) {
        networkExecuteTask(
            action = { getLineupByMatchIDUseCase.invoke(id) }
        ) {

        }
    }
}