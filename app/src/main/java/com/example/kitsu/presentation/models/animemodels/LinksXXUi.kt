package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXX

data class LinksXXUi(
    val related: String,
    val self: String
)

fun LinksXX.toUi() = LinksXXUi(
    related,
    self
)