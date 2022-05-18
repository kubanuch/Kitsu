package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXX

data class LinksXXXXXXXXUi(
    val related: String,
    val self: String
)

fun LinksXXXXXXXX.toUi() = LinksXXXXXXXXUi(
    related,
    self
)