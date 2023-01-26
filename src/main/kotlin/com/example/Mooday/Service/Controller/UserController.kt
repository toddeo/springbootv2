package com.example.mooday.service.controller

import com.example.mooday.service.UserService
import com.example.mooday.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("api/v1")
class UserController(val userService: UserService) {

    @GetMapping( "/users")
    fun getAllUsers(): List<User> {
        return userService.getAllUsers()
    }

    @GetMapping("/user")
    fun getUserById(id: Long): Optional<User> {
        return userService.getUserById(id)
    }
}