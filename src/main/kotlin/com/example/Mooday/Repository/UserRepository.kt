package com.example.mooday.repository

import com.example.mooday.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository: JpaRepository<User, Long> {
    fun findByFirstNameUser(firstName: String): Optional<User>;
}