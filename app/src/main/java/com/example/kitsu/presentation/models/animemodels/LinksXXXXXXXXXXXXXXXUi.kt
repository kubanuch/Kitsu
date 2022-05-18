package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXXXXXXX

data class LinksXXXXXXXXXXXXXXXUi(
    val related: String,
    val self: String
)

fun LinksXXXXXXXXXXXXXXX.toUi() = LinksXXXXXXXXXXXXXXXUi(
    related,
    self
)