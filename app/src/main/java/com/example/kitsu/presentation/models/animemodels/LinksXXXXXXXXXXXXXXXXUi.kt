package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXXXXXXXX

data class LinksXXXXXXXXXXXXXXXXUi(
    val related: String,
    val self: String
)

fun LinksXXXXXXXXXXXXXXXX.toUi() = LinksXXXXXXXXXXXXXXXXUi(
    related,
    self
)