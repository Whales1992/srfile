package com.android.srfileutil.framework

import com.android.core.interceptor.file.AddFile
import com.android.core.interceptor.file.FindFile
import com.android.core.interceptor.file.RemoveFile
import com.android.core.interceptor.file.UpdateFile
import com.android.core.interceptor.auth.LogIn
import com.android.core.interceptor.auth.LogOut
import com.android.core.interceptor.auth.IsLoggedIn

data class Interactors(val logIn: LogIn, val logOut: LogOut, val isLoggedIn: IsLoggedIn, val addFile: AddFile, val findFile: FindFile, val removeFile: RemoveFile, val updateFile: UpdateFile)