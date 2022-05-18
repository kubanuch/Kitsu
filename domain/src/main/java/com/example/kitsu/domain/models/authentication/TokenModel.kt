package com.example.kitsu.domain.models.authentication

data class TokenModel(
    val accessToken: String,
    val createdAt: Long,
    val expiresIn: Int,
    val refreshToken: String,
    val scope: String,
    val tokenType: String,
    )
