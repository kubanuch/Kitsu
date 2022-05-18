package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.PosterImage

data class PosterImageUi(
    val large: String,
    val medium: String,
    val meta: MetaXUi,
    val original: String,
    val small: String,
    val tiny: String
)
fun PosterImage.toUi() = PosterImageUi(
    large,
    medium,
    meta.toUi(),
    original,
    small,
    tiny
)