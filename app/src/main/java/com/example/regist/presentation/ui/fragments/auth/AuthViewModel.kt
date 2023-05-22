package com.example.regist.presentation.ui.fragments.auth

import androidx.lifecycle.ViewModel
import com.example.regist.domain.usecases.AuthUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val authUserUseCase: AuthUserUseCase
) : ViewModel() {

    fun authUser(name: String, password: String, age: Int) {
        authUserUseCase.invoke(name, password, age)
    }
}