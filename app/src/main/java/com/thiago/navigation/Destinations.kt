package com.thiago.navigation

import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
data class Detail(
    val id:Int
)