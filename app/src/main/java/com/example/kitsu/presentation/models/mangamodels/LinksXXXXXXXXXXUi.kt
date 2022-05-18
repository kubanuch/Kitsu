package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksXXXXXXXXXX

data class LinksXXXXXXXXXXUi(
    val related: String?,
    val self: String?
)

fun LinksXXXXXXXXXX.toUi() = LinksXXXXXXXXXXUi(
    related, self
)
