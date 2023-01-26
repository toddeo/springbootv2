package com.example.mooday.service

import com.example.mooday.repository.UserRepository
import com.example.mooday.User
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(val userRepository: UserRepository) {
    fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }

    fun getUserById(id: Long): Optional<User> {
        return userRepository.findById(id)
    }
}
