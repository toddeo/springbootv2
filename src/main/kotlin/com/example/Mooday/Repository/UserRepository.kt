package com.example.mooday.repository

import com.example.mooday.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {

}