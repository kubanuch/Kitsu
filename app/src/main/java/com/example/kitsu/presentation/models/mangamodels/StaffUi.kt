package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Staff

data class StaffUi(
    val links: LinksXXXXXXXXXXXXXXUi?
)

fun Staff.toUi() = StaffUi(
    links?.toUi()
)