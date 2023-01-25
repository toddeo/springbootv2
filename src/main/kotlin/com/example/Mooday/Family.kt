package com.example.mooday

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class Family(

    @Id
    val idFamily: Long,
    val nameFamily: String
)