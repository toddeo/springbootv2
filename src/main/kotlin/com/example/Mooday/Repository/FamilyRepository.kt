package com.example.mooday.repository

import com.example.mooday.Family
import org.springframework.data.jpa.repository.JpaRepository

interface FamilyRepository: JpaRepository<Family, Long> {

}