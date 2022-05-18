package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Dimensions

data class DimensionsUi(
    val large: LargeUi,
    val small: SmallUi,
    val tiny: TinyUi
)

fun Dimensions.toUi() = DimensionsUi(
    large.toUi(), small.toUi(),
    tiny.toUi()
)