package com.example.mooday.service.controller

import com.example.mooday.Family
import com.example.mooday.service.FamilyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1")
class FamilyController(val familyService: FamilyService) {

    @GetMapping( "/moodays")
    fun getFamily(): List<Family> {
        return familyService.getAllFamilies()
    }
}