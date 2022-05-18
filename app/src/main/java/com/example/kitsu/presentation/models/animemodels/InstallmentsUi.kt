package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Installments

data class InstallmentsUi(
    val links: LinksXXXXXXXXXUi
)
fun Installments.toUi() = InstallmentsUi(
    links.toUi()
)