package com.android.core.data

import com.android.core.domain.SRFile

interface IDataSource {
    suspend fun add(srFile: SRFile) : SRFile
    suspend fun remove(srFile: SRFile) : Boolean
    suspend fun update(srFile: SRFile) : SRFile
    suspend fun findOne(srFile: SRFile) : SRFile
}