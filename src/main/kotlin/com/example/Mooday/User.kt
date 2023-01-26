package com.example.mooday

import org.hibernate.Hibernate
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
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as User

        return idUser == other.idUser
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(idUser = $idUser , firstNameUser = $firstNameUser , lastNameUser = $lastNameUser , typeUser = $typeUser , idFamily = $idFamily )"
    }
}