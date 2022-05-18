package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.StreamingLinks

data class StreamingLinksUi(
    val links: LinksXXXXXXXXXXXXXXXXUi
)
fun StreamingLinks.toUi() = StreamingLinksUi(
    links.toUi()
)