package com.example.kitsu.domain.usecases

import com.example.kitsu.domain.repositories.MangaRepository
import javax.inject.Inject

class MangaIdUseCase @Inject constructor(private val repository: MangaRepository) {
    operator fun invoke(id: String) = repository.fetchMangaId(id)
}