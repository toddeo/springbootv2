package com.example.mooday.service

import com.example.mooday.Family
import com.example.mooday.repository.FamilyRepository
import org.springframework.stereotype.Service

@Service
class FamilyService(val familyRepository: FamilyRepository) {

    fun getAllFamilies(): List<Family>{

    return familyRepository.findAll()
    }
}
