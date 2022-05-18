package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksXXX

data class LinksXXXUi(
    val related: String?,
    val self: String?
)
fun LinksXXX.toUi() = LinksXXXUi(
    related,
    self,
)