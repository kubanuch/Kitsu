package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Links

data class LinksUi(
    val self: String?
)

fun Links.toUi() = LinksUi(
    self
)