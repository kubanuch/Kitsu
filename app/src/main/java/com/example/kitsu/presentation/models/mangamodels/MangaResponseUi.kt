package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.MangaResponse

data class MangaResponseUi(
    val `data`: List<MangaModelUi>?,
    val links: LinksXXXXXXXXXXXXXXXUi?,
    val meta: MetaXUi?
)

fun MangaResponse.toUi() = MangaResponseUi(
    `data`.map {
        it.toUi()
    }, links?.toUi(),
    meta?.toUi()
)