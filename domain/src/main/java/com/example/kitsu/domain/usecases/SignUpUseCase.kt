package com.example.kitsu.domain.usecases

import com.example.kitsu.domain.repositories.AuthenticationRepository
import javax.inject.Inject

class SignUpUseCase @Inject constructor(private val authenticationRepository: AuthenticationRepository) {

    operator fun invoke(username: String, password: String) =
        authenticationRepository.authenticate(username, password)
}