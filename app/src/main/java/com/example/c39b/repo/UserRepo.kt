package com.example.c39b.repo

import com.example.c39b.model.UserModel

interface UserRepo {
//    {
//     "success":false/true,
//     "message":"user updated",

//    }


    fun login(email: String, password: String, callback: (Boolean, String) -> Unit)

    fun register()
    fun addUserToDatabase()

    fun editProfile(userId: String, model: UserModel,
                    callback: (Boolean, String) -> Unit)

    fun deleteUser(userId: String, callback: (Boolean, String) -> Unit)

    fun getUserById()
    fun getAllUser()
    fun logout()

}