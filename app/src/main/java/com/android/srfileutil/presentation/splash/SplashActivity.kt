package com.android.srfileutil.presentation.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.srfileutil.databinding.ActivitySplashBinding
import com.android.srfileutil.presentation.splash.actions.ISplashActions
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : AppCompatActivity(), ISplashActions {
    lateinit var splashBinding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(splashBinding.root)


    }

    override fun checkDataStore() {
        //TOdo if a login is true
        setNextScreen()
    }

    override fun setNextScreen() {

    }

}