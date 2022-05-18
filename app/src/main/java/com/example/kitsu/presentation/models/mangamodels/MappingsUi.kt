package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Mappings

data class MappingsUi(
    val links: LinksXXXXXXXXXUi?
)

fun Mappings.toUi() = MappingsUi(
    links?.toUi()
)