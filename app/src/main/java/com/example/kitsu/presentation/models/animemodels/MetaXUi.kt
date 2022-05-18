package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.MetaX

data class MetaXUi(
    val dimensions: DimensionsXUi
)

fun MetaX.toUi() = MetaXUi(
    dimensions.toUi()
)