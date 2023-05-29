package com.example.domain.repositories

import com.example.domain.models.UserData


interface UserDataRepository {

    fun authUser(name: String, password: String, age: Int)

    fun getUser(): UserData
}