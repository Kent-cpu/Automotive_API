package com.example.automotive_api.services


import com.example.automotive_api.models.Person
import com.example.automotive_api.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (private val userRepository: UserRepository) {
    fun save(person: Person): Person {
        return this.userRepository.save(person)
    }
}