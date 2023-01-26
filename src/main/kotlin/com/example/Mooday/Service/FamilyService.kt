package com.example.mooday.service

import com.example.mooday.Family
import com.example.mooday.repository.FamilyRepository
import org.springframework.stereotype.Service
import java.util.*
import javax.swing.text.html.Option

@Service
class FamilyService(val familyRepository: FamilyRepository) {

    fun getAllFamilies(): List<Family> {
        return familyRepository.findAll()
    }

    fun getFamilyById(id: Long): Optional<Family> {
        return familyRepository.findById(id)
    }

    fun getFamilyByName(name: String): Optional<Family> {
        return familyRepository.findByNameFamily(name)
    }
}
