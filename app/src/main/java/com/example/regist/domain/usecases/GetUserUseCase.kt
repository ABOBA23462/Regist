package com.example.regist.domain.usecases

import com.example.regist.domain.repositories.UserDataRepository
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val userDataRepository: UserDataRepository
) {

    operator fun invoke() = userDataRepository.getUser()
}