package com.android.srfileutil.framework.localfilestorage

import com.android.core.interceptor.AddFile
import com.android.core.interceptor.FindFile
import com.android.core.interceptor.RemoveFile
import com.android.core.interceptor.UpdateFile

data class Interactors(val addFile: AddFile, val findFile: FindFile, val removeFile: RemoveFile, val updateFile: UpdateFile)