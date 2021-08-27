package com.android.srfileutil.framework.localfilestorage

import android.app.Application
import com.android.core.data.ISRSource
import com.android.core.domain.SRFile

class MJLocalStorage(application: Application): ISRSource {
    override suspend fun add(srFile: SRFile): SRFile {
        TODO("Not yet implemented")
    }

    override suspend fun remove(srFile: SRFile): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun update(srFile: SRFile): SRFile {
        TODO("Not yet implemented")
    }

    override suspend fun findOne(srFile: SRFile): SRFile {
        TODO("Not yet implemented")
    }
}