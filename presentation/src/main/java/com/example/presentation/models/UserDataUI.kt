package com.example.presentation.models

import com.example.domain.models.UserData

data class UserDataUI(
    val name: String,
    val password: String,
    val age: Int
)

fun UserData.toUI() = UserDataUI(
    name = name, password = password, age = age
)
