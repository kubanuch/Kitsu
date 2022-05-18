package com.example.kitsu.presentation.ui.fragment.auth

import com.example.kitsu.base.BaseViewModel
import com.example.kitsu.domain.usecases.SignUpUseCase
import com.example.kitsu.presentation.models.authentication.TokenUi
import com.example.kitsu.presentation.models.authentication.toUi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(private val signInUseCase: SignUpUseCase) :
    BaseViewModel() {

    private val _signInState = mutableUIStateFlow<TokenUi>()
    val signInState = _signInState.asStateFlow()

    fun fetchSignIs(username: String, password: String) =
        signInUseCase(username, password).collectRequest(_signInState) {
            it.toUi()
        }
}