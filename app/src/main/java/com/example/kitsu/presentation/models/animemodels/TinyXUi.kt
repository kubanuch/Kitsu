package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.TinyX

data class TinyXUi(
    val height: Int,
    val width: Int
)

fun TinyX.toUi() = TinyXUi(
    height,
    width
)