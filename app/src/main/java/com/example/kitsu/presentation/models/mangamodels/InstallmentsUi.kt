package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Installments

data class InstallmentsUi(
    val links: LinksXXXXXXUi?
)

fun Installments.toUi() = InstallmentsUi(
    links?.toUi()
)