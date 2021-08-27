package com.android.srfileutil.framework.datastore

import kotlinx.coroutines.flow.Flow

interface IDataStore {
    fun isNightMode(): Flow<Boolean>
    suspend fun toggleNightMode()


    fun isLoggedIn(): Flow<Boolean>
    suspend fun toggleIsLoggedIn()
}