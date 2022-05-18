package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXXXXX

data class LinksXXXXXXXXXXXXXUi(
    val related: String,
    val self: String
)

fun LinksXXXXXXXXXXXXX.toUi() = LinksXXXXXXXXXXXXXUi(
    related,
    self
)