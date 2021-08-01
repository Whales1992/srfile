package com.android.core.interceptor

import com.android.core.data.ISRFileRepository
import com.android.core.domain.SRFile

class RemoveFile(private val isrFileRepository: ISRFileRepository){
    suspend operator fun invoke(srFile: SRFile) = isrFileRepository.removeFile(srFile)
}