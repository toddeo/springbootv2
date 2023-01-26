package com.example.mooday

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class User(

    @Id
    val idUser: Long,
    val firstNameUser: String,
    val lastNameUser: String,
    val typeUser: String,
    val idFamily: Long,
)