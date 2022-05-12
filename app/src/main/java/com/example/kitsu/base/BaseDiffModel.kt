package com.example.kitsu.base

interface BaseDiffModel {
    val id: String?
    override fun equals(other: Any?): Boolean
}