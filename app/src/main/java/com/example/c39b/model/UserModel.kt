package com.example.c39b.model

data class UserModel(
    val id : String = "",
    val email : String = "",
    val firstName : String = "",
    val lName : String = "",
    val contact : String = "",
){
    fun toMap() : Map<String,Any?>{
        return mapOf(
            "firstName" to firstName,
            "lName" to lName,
            "contact" to contact,
        )
    }


}
