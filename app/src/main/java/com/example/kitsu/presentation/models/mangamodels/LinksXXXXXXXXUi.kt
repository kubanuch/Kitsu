package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksXXXXXXXX

data class LinksXXXXXXXXUi(
    val related: String?,
    val self: String?
)

fun LinksXXXXXXXX.toUi() = LinksXXXXXXXXUi(
    related, self
)