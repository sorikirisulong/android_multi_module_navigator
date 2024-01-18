package com.hsh.navigation.navigator

import android.content.Context

interface MainNavigator {
    fun redirectToMain(
        context: Context,
        param1: String
    )
}