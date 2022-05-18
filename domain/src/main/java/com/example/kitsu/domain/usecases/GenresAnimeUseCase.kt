package com.example.kitsu.domain.usecases

import com.example.kitsu.domain.repositories.GenresRepository
import javax.inject.Inject

class GenresAnimeUseCase @Inject constructor(private val repository: GenresRepository) {
    operator fun invoke(id: String) = repository.fetchGenresAnime(id)
}