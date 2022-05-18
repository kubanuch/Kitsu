package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.MediaRelationships

data class MediaRelationshipsUi(
    val links: LinksXXXXXXXXXXXUi
)
fun MediaRelationships.toUi() =  MediaRelationshipsUi(
    links.toUi()
)