package com.android.core.interceptor.file

import com.android.core.data.SRFileRepository
import com.android.core.domain.SRFile

class UpdateFile(private val srFileRepository: SRFileRepository){
    suspend operator fun invoke(srFile: SRFile) = srFileRepository.updateFile(srFile)
}