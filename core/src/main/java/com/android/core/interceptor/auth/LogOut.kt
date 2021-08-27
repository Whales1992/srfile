package com.android.core.interceptor.auth

import com.android.core.data.IDataSource

class LogOut(private val iDataSource: IDataSource){
    suspend operator fun invoke() = iDataSource.logOut()
}