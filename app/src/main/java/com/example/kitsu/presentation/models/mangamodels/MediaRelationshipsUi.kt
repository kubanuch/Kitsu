package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.MediaRelationships

data class MediaRelationshipsUi(
    val links: LinksXXXXXXXXXXUi?
)

fun MediaRelationships.toUi() = MediaRelationshipsUi(
    links?.toUi()
)