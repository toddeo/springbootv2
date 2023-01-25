package com.example.Mooday.Service.Controller

import com.example.Mooday.Adult
import com.example.Mooday.Service.AdultService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1")
class AdultController(val adultService: AdultService) {

    @GetMapping( "/moodays")
    fun getAdult(): List<Adult> {
        return adultService.getAllAdult()
    }

}