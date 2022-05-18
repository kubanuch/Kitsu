package com.example.kitsu.presentation.models.genresmodels

import com.example.kitsu.domain.models.genresmodels.LinksModel

data class LinksModelUi(
    val last: String?,
    val first: String?,
)

fun LinksModel.toUi() = LinksModelUi(
    last, first
)