package com.android.srfileutil

import android.app.Application

class ApplicationClass : Application() {
    private lateinit var application: Application

    override fun onCreate() {
        super.onCreate()
        setApplication()
    }

    private fun setApplication(){
        application = this;
    }

    fun getApplication(): Application {
        return this.application
    }
}