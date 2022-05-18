package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Dimensions

data class DimensionsUi(
    val large: LargeUi?,
    val medium: MediumUi?,
    val small: SmallUi?,
    val tiny: TinyUi?
)

fun Dimensions.toUi() = DimensionsUi(
    large?.toUi(),
    medium?.toUi(),
    small?.toUi(),
    tiny?.toUi(),
)