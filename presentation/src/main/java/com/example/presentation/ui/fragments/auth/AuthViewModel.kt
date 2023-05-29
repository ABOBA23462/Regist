package com.example.presentation.ui.fragments.auth

import androidx.lifecycle.ViewModel
import com.example.domain.usecases.AuthUserUseCase
import com.example.domain.usecases.GetUserUseCase
import com.example.presentation.models.UserDataUI
import com.example.presentation.models.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val authUserUseCase: AuthUserUseCase,
    private val getUserUseCase: GetUserUseCase
) : ViewModel() {

    fun authUser(name: String, password: String, age: Int) {
        authUserUseCase.invoke(name, password, age)
    }

    fun getUser() : UserDataUI{
        return getUserUseCase().toUI()
    }
}