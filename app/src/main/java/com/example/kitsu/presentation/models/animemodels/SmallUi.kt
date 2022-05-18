package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Small

data class SmallUi(
    val height: Int,
    val width: Int
)

fun Small.toUi() = SmallUi(
    height, width
)