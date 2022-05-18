package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Large

data class LargeUi(
    val height: Int,
    val width: Int
)

fun Large.toUi() = LargeUi(
    height, width
)