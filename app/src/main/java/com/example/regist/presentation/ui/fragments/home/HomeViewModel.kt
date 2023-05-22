package com.example.regist.presentation.ui.fragments.home

import androidx.lifecycle.ViewModel
import com.example.regist.domain.usecases.GetUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getUserUseCase: GetUserUseCase
) : ViewModel() {

    fun getUser() = getUserUseCase
}