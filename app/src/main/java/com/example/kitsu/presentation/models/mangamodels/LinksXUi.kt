package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksX

data class LinksXUi(
    val related: String?,
    val self: String?
)

fun LinksX.toUi() = LinksXUi(
    related,
    self,
)