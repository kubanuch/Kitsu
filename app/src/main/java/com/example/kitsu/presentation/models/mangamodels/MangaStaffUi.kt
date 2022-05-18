package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.MangaStaff

data class MangaStaffUi(
    val links: LinksXXXXXXXXUi?
)

fun MangaStaff.toUi() = MangaStaffUi(
    links?.toUi()
)