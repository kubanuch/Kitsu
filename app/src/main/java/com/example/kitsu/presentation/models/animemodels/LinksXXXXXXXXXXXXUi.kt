package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXXXXX

data class LinksXXXXXXXXXXXXUi(
    val related: String,
    val self: String
)

fun LinksXXXXXXXXXXXX.toUi() = LinksXXXXXXXXXXXXUi(
    related,
    self
)