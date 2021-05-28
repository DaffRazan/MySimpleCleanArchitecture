package com.daffa.mysimplecleanarchitecture.data

import com.daffa.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcome to the clean architecture")
}