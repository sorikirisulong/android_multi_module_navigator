package com.hsh.navigationsample.ui

import android.content.Context
import com.hsh.navigation.navigator.MainNavigator
import javax.inject.Inject

class MainNavigatorImpl @Inject constructor() : MainNavigator {
    override fun redirectToMain(context: Context, param1: String) {
        val builder = MainActivityIntentBuilder()
        builder.setFirstParam(param1)
        builder.start(context)
    }
}