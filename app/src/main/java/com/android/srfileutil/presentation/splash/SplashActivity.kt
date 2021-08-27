package com.android.srfileutil.presentation.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.android.core.data.DataSourceImp
import com.android.core.data.SRSourceImp
import com.android.core.interceptor.auth.IsLoggedIn
import com.android.core.interceptor.auth.LogIn
import com.android.core.interceptor.auth.LogOut
import com.android.core.interceptor.file.AddFile
import com.android.srfileutil.ApplicationClass
import com.android.srfileutil.databinding.ActivitySplashBinding
import com.android.srfileutil.framework.Interactors
import com.android.srfileutil.framework.SRFViewModelFactory
import com.android.srfileutil.presentation.splash.actions.ISplashActions

class SplashActivity : AppCompatActivity(), ISplashActions {
    lateinit var splashBinding: ActivitySplashBinding
    lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(splashBinding.root)

        val dataSourceImplementation = DataSourceImp()
        val srSourceImp = SRSourceImp()

//        val interactors = Interactors(LogIn(dataSourceImplementation), LogOut(dataSourceImplementation),
//        IsLoggedIn(dataSourceImplementation), AddFile(srSourceImp)
//        )
//        val srfViewModelFactory = SRFViewModelFactory.inject(ApplicationClass().getApplication(), )
//        splashViewModel = ViewModelProvider(this, SRFViewModelFactory).get(SplashViewModel::class.java)

//        splashViewModel.isLoggedIn.
    }

    override fun checkDataStore() {
        setNextScreen()
    }

    override fun setNextScreen() {

    }

}