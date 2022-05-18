package com.example.kitsu.domain.models.genresmodels

data class GenresList(
    val data: List<GenresModels>,
    val meta: MetaModel? = null,
    val links: LinksModel? = null,
)