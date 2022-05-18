package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksXXXXXXX

data class LinksXXXXXXXUi(
    val related: String?,
    val self: String?
)

fun LinksXXXXXXX.toUi() = LinksXXXXXXXUi(
    related, self
)