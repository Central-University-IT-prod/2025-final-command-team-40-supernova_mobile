package com.nikol.data.local.models

import kotlinx.serialization.Serializable

@Serializable
data class UserPreferences(
    val email: String,
    val password: String
)