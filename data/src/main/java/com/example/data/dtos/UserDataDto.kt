package com.example.data.dtos

import com.example.domain.models.UserData

data class UserDataDto(
    val name: String,
    val password: String,
    val age: Int
)

fun UserDataDto.toDomain()= UserData(
name = name, password = password, age = age
)