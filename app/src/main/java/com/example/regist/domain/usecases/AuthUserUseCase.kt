package com.example.regist.domain.usecases

import com.example.regist.domain.repositories.UserDataRepository
import javax.inject.Inject

class AuthUserUseCase @Inject constructor(
    private val userDataRepository: UserDataRepository
) {

    operator fun invoke(name: String, password: String, age: Int){
        userDataRepository.authUser(name, password, age)
    }
}