package com.example.kitsu.domain.usecases

import com.example.kitsu.domain.repositories.PixaBayRepository
import javax.inject.Inject

class PixaBayUseCase @Inject constructor(private val repository: PixaBayRepository) {
    operator fun invoke() = repository.fetchPixabay()
}