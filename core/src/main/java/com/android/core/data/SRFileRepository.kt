package com.android.core.data

import com.android.core.domain.SRFile

class SRFileRepository(private val isrSource : ISRSource) {
    suspend fun addFile(srFile: SRFile) = isrSource.add(srFile)

    suspend fun removeFile(srFile: SRFile) = isrSource.remove(srFile)

    suspend fun updateFile(srFile: SRFile) = isrSource.update(srFile)

    suspend fun findFile(srFile: SRFile) = isrSource.findOne(srFile)
}