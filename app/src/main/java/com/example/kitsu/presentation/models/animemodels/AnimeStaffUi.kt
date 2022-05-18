package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.AnimeStaff

data class AnimeStaffUi(
    val links: LinksXXXUi
)
fun AnimeStaff.toUi() =  AnimeStaffUi(
    links.toUi()
)