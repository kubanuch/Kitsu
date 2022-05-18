package com.example.kitsu.domain.repositories

import com.example.kitsu.domain.either.Either
import com.example.kitsu.domain.models.genresmodels.GenresList
import kotlinx.coroutines.flow.Flow

interface GenresRepository {

    fun fetchGenresAnime(id: String): Flow<Either<String, GenresList>>
    fun fetchGenresManga(id: String): Flow<Either<String, GenresList>>
}