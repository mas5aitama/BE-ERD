package com.boot_kotlin.app.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.web.bind.annotation.CrossOrigin

@Document(collection = "users")
data class User(
        @Id
        var id: String? = ObjectId().toHexString(),
        val firstName: String,
        val lastName: String,
        var age: String,
        var dept: String,
        val emailId: String
)