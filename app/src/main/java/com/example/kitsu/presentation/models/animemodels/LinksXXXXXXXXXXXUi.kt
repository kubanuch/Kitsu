package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXXX

data class LinksXXXXXXXXXXXUi(
    val related: String,
    val self: String
)

fun LinksXXXXXXXXXXX.toUi() = LinksXXXXXXXXXXXUi(
    related,
    self
)