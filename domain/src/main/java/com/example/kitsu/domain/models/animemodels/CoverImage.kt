package com.example.kitsu.domain.models.animemodels

data class CoverImage(
    val large: String,
    val meta: Meta,
    val original: String,
    val small: String,
    val tiny: String
)