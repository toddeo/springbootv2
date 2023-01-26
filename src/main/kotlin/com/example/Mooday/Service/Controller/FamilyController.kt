package com.example.mooday.service.controller

import com.example.mooday.Family
import com.example.mooday.service.FamilyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("api/v1")
class FamilyController(val familyService: FamilyService) {

    @GetMapping("/families")
    fun getAllFamilies(): List<Family> {
        return familyService.getAllFamilies()
    }

    @GetMapping("/family/{familyId}")
    fun getFamilyById(@PathVariable(value = "familyId") id: Long): Optional<Family> {
        return familyService.getFamilyById(id)
    }
}