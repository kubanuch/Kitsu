package com.example.kitsu.presentation.models.animemodels

import com.example.kitsu.domain.models.animemodels.Reviews

data class ReviewsUi(
    val links: LinksXXXXXXXXXXXXXXUi
)
fun Reviews.toUi() = ReviewsUi(
    links.toUi()
)