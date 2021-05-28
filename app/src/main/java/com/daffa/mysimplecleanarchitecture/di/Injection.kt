package com.daffa.mysimplecleanarchitecture.di

import com.daffa.mysimplecleanarchitecture.data.IMessageDataSource
import com.daffa.mysimplecleanarchitecture.data.MessageDataSource
import com.daffa.mysimplecleanarchitecture.data.MessageRepository
import com.daffa.mysimplecleanarchitecture.domain.IMessageRepository
import com.daffa.mysimplecleanarchitecture.domain.MessageInteractor
import com.daffa.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}