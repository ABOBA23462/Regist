package com.example.regist.domain.repositories

import com.example.regist.models.UserData


interface UserDataRepository {

    fun authUser(name: String, password: String, age: Int)

    fun getUser(): UserData
}