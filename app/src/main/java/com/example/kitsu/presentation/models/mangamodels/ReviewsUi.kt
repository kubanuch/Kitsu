package com.example.kitsu.presentation.models.mangamodels

import com.example.kitsu.domain.models.mangamodels.Reviews

data class ReviewsUi(
    val links: LinksXXXXXXXXXXXXXUi?
)

fun Reviews.toUi() = ReviewsUi(
    links?.toUi()
)