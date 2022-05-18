package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXX

data class LinksXXXUi(
    val related: String,
    val self: String
)

fun LinksXXX.toUi() = LinksXXXUi(
    related,
    self
)