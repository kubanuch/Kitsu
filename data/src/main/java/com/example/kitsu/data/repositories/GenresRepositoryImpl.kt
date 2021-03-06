package com.example.kitsu.data.repositories

import com.example.kitsu.data.remote.apiservices.GenresApiService
import com.example.kitsu.data.remote.dtos.genresmodels.toDomain
import com.example.kitsu.data.repositories.base.BaseRepository
import com.example.kitsu.domain.repositories.GenresRepository
import javax.inject.Inject

class GenresRepositoryImpl @Inject constructor(
    private val service: GenresApiService
) : BaseRepository(), GenresRepository {

    override fun fetchGenresAnime(id: String) = doRequest {
        service.fetchGenresAnime(id).toDomain()
    }

    override fun fetchGenresManga(id: String) = doRequest {
        service.fetchGenresManga(id).toDomain()
    }
}