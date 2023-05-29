package com.example.data.repositories

import com.example.data.dtos.UserDataDto
import com.example.data.dtos.toDomain
import com.example.data.local.preferences.UserDataPreferencesHelper
import com.example.domain.models.UserData
import com.example.domain.repositories.UserDataRepository
import javax.inject.Inject

class UserDataRepositoryImpl @Inject constructor(
    private val userDataPreferencesHelper: UserDataPreferencesHelper
) : UserDataRepository {

    override fun authUser(name: String, password: String, age: Int) {
        userDataPreferencesHelper.apply {
            this.name = name
            this.password = password
            this.age = age
            return
        }
    }

    override fun getUser() = UserDataDto(
        userDataPreferencesHelper.name.toString(),
        userDataPreferencesHelper.password.toString(),
        userDataPreferencesHelper.age
    ).toDomain()
}