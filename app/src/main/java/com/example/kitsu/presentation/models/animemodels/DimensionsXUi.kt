package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.DimensionsX

data class DimensionsXUi(
    val largeUi: LargeXUi,
    val medium: MediumUi,
    val small: SmallXUi,
    val tiny: TinyXUi
)

fun DimensionsX.toUi() = DimensionsXUi(
    large.toUi(),
    medium.toUi(),
    small.toUi(),
    tiny.toUi()

)