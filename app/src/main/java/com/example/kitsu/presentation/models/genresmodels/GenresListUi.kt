package com.example.kitsu.presentation.models.genresmodels

import com.example.kitsu.domain.models.genresmodels.GenresList

data class GenresListUi(
    val data: List<GenresModelsUi>,
    val meta: MetaModelUi? = null,
    val links: LinksModelUi? = null,
)

fun GenresList.toUi() = GenresListUi(
    data.map { it.toUi() },
    meta?.toUi(),
    links?.toUi(),
)
