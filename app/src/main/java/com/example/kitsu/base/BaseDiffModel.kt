package com.example.kitsu.base

interface BaseDiffModel {
    val id: Int
    override fun equals(other: Any?): Boolean
}