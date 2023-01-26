package com.example.mooday.repository

import com.example.mooday.Family
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface FamilyRepository: JpaRepository<Family, Long> {
    fun findByNameFamily(nameFamily: String): Optional<Family>;
}