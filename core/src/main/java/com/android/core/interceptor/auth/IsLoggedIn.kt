package com.android.core.interceptor.auth

import com.android.core.data.IDataSource

class IsLoggedIn(private val iDataSource: IDataSource){
    suspend operator fun invoke() = iDataSource.isLoggedIn()
}