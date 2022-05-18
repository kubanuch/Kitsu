package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksXXXXXXXXX

data class LinksXXXXXXXXXUi(
    val related: String,
    val self: String
)

fun LinksXXXXXXXXX.toUi() = LinksXXXXXXXXXUi(
    related,
    self
)