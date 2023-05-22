package com.example.regist.data.repositories

import com.example.regist.data.local.preferences.UserDataPreferencesHelper
import com.example.regist.domain.repositories.UserDataRepository
import com.example.regist.models.UserData
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

    override fun getUser() = UserData(userDataPreferencesHelper.name.toString(), userDataPreferencesHelper.password.toString(), userDataPreferencesHelper.age)
}