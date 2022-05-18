package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.base.BaseDiffModel
import com.example.kitsu.domain.models.mangamodels.MangaModel

data class MangaModelUi(
    val attributes: AttributesUi?,
    override val id: String?,
    val links: LinksUi?,
    val relationships: RelationshipsUi?,
    val type: String?
) : BaseDiffModel

fun MangaModel.toUi() = MangaModelUi(
    attributes?.toUi(),
    id,
    links?.toUi(),
    relationships?.toUi(),
    type,
)