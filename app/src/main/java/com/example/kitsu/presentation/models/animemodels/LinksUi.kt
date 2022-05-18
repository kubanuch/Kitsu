package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Links

data class LinksUi(
    val self: String
)

fun Links.toUi() = LinksUi(
    self
)