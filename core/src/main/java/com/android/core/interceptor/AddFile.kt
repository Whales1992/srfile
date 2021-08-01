package com.android.core.interceptor

import com.android.core.data.ISRFileRepository
import com.android.core.domain.SRFile

class AddFile(private val isrFileRepository: ISRFileRepository){
    suspend operator fun invoke(srFile: SRFile) = isrFileRepository.addFile(srFile)
}