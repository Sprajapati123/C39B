package com.example.c39b.repo

import com.example.c39b.model.UserModel

interface UserRepo {
//    {
//     "success":false/true,
//     "message":"user updated",

//    }


    fun login(
        email: String, password: String,
        callback: (Boolean, String) -> Unit
    )

    //authentication
    fun register(
        email: String, password: String,
        callback: (Boolean, String, String) -> Unit
    )

    //database
    fun addUserToDatabase(
        id: String, model: UserModel,
        callback: (Boolean, String) -> Unit
    )

    fun editProfile(
        userId: String, model: UserModel,
        callback: (Boolean, String) -> Unit
    )
    fun deleteUser(userId: String,
                   callback: (Boolean, String) -> Unit)
    fun getUserById(
        id: String,
        callback: (Boolean, String, UserModel?) -> Unit
    )
    fun getAllUser(callback: (Boolean,
                              String,List<UserModel>?) -> Unit)
    fun logout(callback: (Boolean, String) -> Unit)


    fun forgetPassword(email: String,
                       callback: (Boolean, String) -> Unit)
}