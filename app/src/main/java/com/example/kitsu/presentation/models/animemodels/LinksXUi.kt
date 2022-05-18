package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.LinksX

data class LinksXUi(
    val related: String,
    val self: String
)

fun LinksX.toUi() = LinksXUi(
    related, self
)