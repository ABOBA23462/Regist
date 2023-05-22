package com.example.regist.data.local.preferences

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserDataPreferencesHelper @Inject constructor(
    @ApplicationContext context: Context
) {

    private val sharedPreferences = context.getSharedPreferences("user_data", Context.MODE_PRIVATE)

    var name: String?
        get() = sharedPreferences.getString("user_name", "")
        set(value) = sharedPreferences.edit().putString("user_name", value).apply()

    var password: String?
        get() = sharedPreferences.getString("user_password", "")
        set(value) = sharedPreferences.edit().putString("user_password", value).apply()

    var age: Int
        get() = sharedPreferences.getInt("user_age", -1)
        set(value) = sharedPreferences.edit().putInt("user_name", value).apply()
}