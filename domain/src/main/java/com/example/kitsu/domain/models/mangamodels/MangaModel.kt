package com.example.kitsu.domain.models.mangamodels

data class MangaModel(
    val attributes: Attributes?,
    val id: String?,
    val links: Links?,
    val relationships: Relationships?,
    val type: String?
)