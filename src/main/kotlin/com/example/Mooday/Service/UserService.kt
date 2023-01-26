package com.example.mooday.service

import com.example.mooday.repository.UserRepository
import com.example.mooday.User
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) {
    fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }
}
