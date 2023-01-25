package com.example.Mooday.Service

import com.example.Mooday.Adult
import com.example.Mooday.Repository.AdultRepository
import org.springframework.stereotype.Service

@Service
class AdultService(val adultRepository: AdultRepository) {

    fun getAllAdult(): List<Adult>{

    return adultRepository.findAll()
    }
}
