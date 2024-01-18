package com.hsh.navigation

import android.app.Application
import android.util.Log

object Navigation {

    private lateinit var application: Application

    fun init(application: Application) {
        this.application = application
    }

    fun getContext(): Application? {
        return if (::application.isInitialized) {
            application
        } else {
            Log.e("Navigation", "Navigation application is not initialized")
            null
        }
    }
}