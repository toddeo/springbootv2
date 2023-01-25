package com.example.Mooday.Repository

import com.example.Mooday.Adult
import org.springframework.data.jpa.repository.JpaRepository

interface AdultRepository: JpaRepository<Adult, Long> {

}