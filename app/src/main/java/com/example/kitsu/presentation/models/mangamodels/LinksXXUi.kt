package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksXX

data class LinksXXUi(
    val related: String?,
    val self: String?
)

fun LinksXX.toUi() = LinksXXUi(
    related,
    self,
)