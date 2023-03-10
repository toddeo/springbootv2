package com.example.mooday.service.controller

import com.example.mooday.service.UserService
import com.example.mooday.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("api/v1")
class UserController(val userService: UserService) {

    @GetMapping("/users")
    fun getAllUsers(): List<User> {
        return userService.getAllUsers()
    }

    @GetMapping("/user/{userId}")
    fun getUserById(@PathVariable(value = "userId") id: Long): Optional<User> {
        return userService.getUserById(id)
    }

    @GetMapping("/user/{userFirstName}")
    fun getUserByFirstName(@PathVariable(value = "userFirstName") name: String): Optional<User> {
        return userService.getUserByFirstName(name)
    }
}