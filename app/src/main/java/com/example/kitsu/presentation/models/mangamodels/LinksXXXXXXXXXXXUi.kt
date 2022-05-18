package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.LinksXXXXXXXXXXX

data class LinksXXXXXXXXXXXUi(
    val related: String?,
    val self: String?
)

fun LinksXXXXXXXXXXX.toUi() = LinksXXXXXXXXXXXUi(
    related, self
)