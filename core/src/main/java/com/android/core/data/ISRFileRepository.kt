package com.android.core.data

import com.android.core.domain.SRFile

interface ISRFileRepository {
    suspend fun addFile(srFile: SRFile) : SRFile
    suspend fun removeFile(srFile: SRFile) : Boolean
    suspend fun updateFile(srFile: SRFile) : SRFile
    suspend fun findFile(srFile: SRFile) : SRFile
}