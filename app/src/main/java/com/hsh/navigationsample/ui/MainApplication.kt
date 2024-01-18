package com.hsh.navigationsample.ui

import android.app.Application
import com.hsh.navigation.Navigation
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.migration.CustomInject

@CustomInject
@HiltAndroidApp
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initNavigation()
    }

    private fun initNavigation() {
        Navigation.init(this)
    }
}