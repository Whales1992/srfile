package com.android.core.data

import com.android.core.domain.SRFile

class SRFileRepository(private val dataSources : IDataSource) : ISRFileRepository {
    override suspend fun addFile(srFile: SRFile) = dataSources.add(srFile)

    override suspend fun removeFile(srFile: SRFile) = dataSources.remove(srFile)

    override suspend fun updateFile(srFile: SRFile) = dataSources.update(srFile)

    override suspend fun findFile(srFile: SRFile) = dataSources.findOne(srFile)
}