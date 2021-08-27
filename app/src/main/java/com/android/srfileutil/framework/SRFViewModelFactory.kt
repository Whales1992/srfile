package com.android.srfileutil.framework

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android.srfileutil.presentation.splash.SplashViewModel
object SRFViewModelFactory : ViewModelProvider.Factory {

  lateinit var application: Application
  lateinit var dependencies: Interactors

  fun inject(application: Application, dependencies: Interactors) {
    SRFViewModelFactory.application = application
    SRFViewModelFactory.dependencies = dependencies
  }

  override fun <T : ViewModel?> create(modelClass: Class<T>): T {
    if(SplashViewModel::class.java.isAssignableFrom(modelClass)) {
      return modelClass.getConstructor(Application::class.java, Interactors::class.java).newInstance(application,dependencies)
    } else {
      throw IllegalStateException("ViewModel must extend MajesticViewModel")
    }
  }

}
