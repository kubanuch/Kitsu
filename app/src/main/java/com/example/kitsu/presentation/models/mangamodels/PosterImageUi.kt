package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.PosterImage

data class PosterImageUi(
    val large: String?,
    val medium: String?,
    val meta: MetaUi?,
    val original: String?,
    val small: String?,
    val tiny: String?
)

fun PosterImage.toUi() = PosterImageUi(
    large,
    medium,
    meta?.toUi(),
    original,
    small,
    tiny,
)