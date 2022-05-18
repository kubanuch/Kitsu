package com.example.kitsu.domain.usecases

import com.example.kitsu.domain.repositories.AnimeRepository
import javax.inject.Inject

class AnimeIdUseCase @Inject constructor(private val repository: AnimeRepository) {
    operator fun invoke(id: String) = repository.fetchAnimeId(id)
}