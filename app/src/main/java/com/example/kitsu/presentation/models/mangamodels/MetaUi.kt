package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Meta

data class MetaUi(
    val dimensions: DimensionsUi?
)

fun Meta.toUi() = MetaUi(
    dimensions?.toUi()
)