package com.example.kitsu.presentation.ui.fragment

import com.example.kitsu.base.BaseViewModel
import com.example.kitsu.domain.usecases.PixaBayUseCase
import com.example.kitsu.presentation.models.PixaBayModelUI
import com.example.kitsu.presentation.models.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class PixaBayViewModel @Inject constructor(private val useCase: PixaBayUseCase) :
    BaseViewModel() {

    private val _heroesState = mutableUIStateFlow<List<PixaBayModelUI>>()
    val heroesState = _heroesState.asStateFlow()


    init {
        fetchPixaBay()
    }

    private fun fetchPixaBay() {
        useCase().collectRequest(_heroesState) { response ->
            response.toUI().hits
        }
    }
}