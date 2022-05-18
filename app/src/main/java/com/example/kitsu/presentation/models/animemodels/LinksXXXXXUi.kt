package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXXXX

data class LinksXXXXXUi(
    val related: String,
    val self: String
)

fun LinksXXXXX.toUi() = LinksXXXXXUi(
    related,
    self
)