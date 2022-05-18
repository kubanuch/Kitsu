package com.example.kitsu.presentation.models.authentication

import com.example.kitsu.domain.models.authentication.TokenModel

data class TokenUi(
    val accessToken: String,
    val createdAt: Long,
    val expiresIn: Int,
    val refreshToken: String,
    val scope: String,
    val tokenType: String,

    )

fun TokenModel.toUi() = TokenUi(
    accessToken,
    createdAt,
    expiresIn, refreshToken, scope, tokenType
)
