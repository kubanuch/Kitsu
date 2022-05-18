package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXX

data class LinksXXXXXXXXXXUi(
    val related: String,
    val self: String
)

fun LinksXXXXXXXXXX.toUi() = LinksXXXXXXXXXXUi(
    related,
    self
)