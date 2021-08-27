package com.android.core.interceptor.auth

import com.android.core.data.IDataSource
import com.google.gson.JsonObject

class LogIn(private val iDataSource: IDataSource){
    suspend operator fun invoke(jsonObject: JsonObject) = iDataSource.loginIn(jsonObject)
}