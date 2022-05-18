package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXXXXXX

data class LinksXXXXXXXUi(
    val related: String,
    val self: String
)

fun LinksXXXXXXX.toUi() = LinksXXXXXXXUi(
    related,
    self
)