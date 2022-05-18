package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Mappings

data class MappingsUi(
    val links: LinksXXXXXXXXXXUi
)

fun Mappings.toUi() = MappingsUi(
    links.toUi()
)