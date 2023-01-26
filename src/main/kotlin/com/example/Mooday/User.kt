package com.example.mooday

import com.example.mooday.utils.enums.UserTypeEnum
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
    val typeUser: UserTypeEnum,
)