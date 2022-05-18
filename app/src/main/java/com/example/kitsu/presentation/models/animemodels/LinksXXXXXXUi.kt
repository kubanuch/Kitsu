package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXXXXX

data class LinksXXXXXXUi(
    val related: String,
    val self: String
)

fun LinksXXXXXX.toUi() = LinksXXXXXXUi(
    related,
    self
)