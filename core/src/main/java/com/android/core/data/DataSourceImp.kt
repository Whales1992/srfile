package com.android.core.data

import com.google.gson.JsonObject

class DataSourceImp : IDataSource {
    override suspend fun isLoggedIn(): Boolean {
        return false
    }

    override suspend fun loginIn(userObject: JsonObject): Boolean {
        return false
    }

    override suspend fun logOut(): Boolean {
       return false
    }
}