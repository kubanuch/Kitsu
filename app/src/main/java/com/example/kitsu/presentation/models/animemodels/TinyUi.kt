package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Tiny

data class TinyUi(
    val height: Int,
    val width: Int
)
fun Tiny.toUi() = TinyUi(
    height,width
)