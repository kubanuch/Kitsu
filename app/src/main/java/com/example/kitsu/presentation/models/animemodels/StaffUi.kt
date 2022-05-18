package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Staff

data class StaffUi(
    val links: LinksXXXXXXXXXXXXXXXUi
)
fun Staff.toUi() = StaffUi(
    links.toUi()
)