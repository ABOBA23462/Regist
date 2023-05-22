package com.example.regist.di

import com.example.regist.data.repositories.UserDataRepositoryImpl
import com.example.regist.domain.repositories.UserDataRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun provideUserRepository(repositoryImpl: UserDataRepositoryImpl): UserDataRepository
}