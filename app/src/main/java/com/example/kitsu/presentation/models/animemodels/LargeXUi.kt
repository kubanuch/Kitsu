package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LargeX

data class LargeXUi(
    val height: Int,
    val width: Int
)

fun LargeX.toUi() = LargeXUi(
    height,
    width
)