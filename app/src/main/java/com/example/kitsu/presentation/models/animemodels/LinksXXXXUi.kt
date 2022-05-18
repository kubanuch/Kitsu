package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXXX

data class LinksXXXXUi(
    val related: String,
    val self: String
)

fun LinksXXXX.toUi() = LinksXXXXUi(
    related,
    self
)