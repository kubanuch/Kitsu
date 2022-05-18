package com.example.kitsu.domain.models.mangamodels

data class PosterImage(
    val large: String?,
    val medium: String?,
    val meta: Meta?,
    val original: String?,
    val small: String?,
    val tiny: String?
)