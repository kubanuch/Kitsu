package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXXXXXX

data class LinksXXXXXXXXXXXXXXUi(
    val related: String,
    val self: String
)

fun LinksXXXXXXXXXXXXXX.toUi() = LinksXXXXXXXXXXXXXXUi(
    related,
    self
)