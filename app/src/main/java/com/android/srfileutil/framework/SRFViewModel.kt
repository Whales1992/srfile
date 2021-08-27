package com.android.srfileutil.framework

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.android.srfileutil.ApplicationClass

open class SRFViewModel(application: Application) : AndroidViewModel(application) {
  protected val application: ApplicationClass = getApplication()
}
