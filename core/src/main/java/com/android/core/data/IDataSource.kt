package com.android.core.data

import com.google.gson.JsonObject

interface IDataSource {
    suspend fun isLoggedIn() : Boolean
    suspend fun loginIn(userObject: JsonObject) : Boolean
    suspend fun logOut() : Boolean
}