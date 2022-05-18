package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.SmallX

data class SmallXUi(
    val height: Int,
    val width: Int
)

fun SmallX.toUi() = SmallXUi(
    height,
    width
)