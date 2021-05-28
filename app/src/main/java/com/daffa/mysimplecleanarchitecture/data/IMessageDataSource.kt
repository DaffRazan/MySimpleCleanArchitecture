package com.daffa.mysimplecleanarchitecture.data

import com.daffa.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}