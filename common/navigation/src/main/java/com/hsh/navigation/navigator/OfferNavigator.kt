package com.hsh.navigation.navigator

import android.content.Context

interface OfferNavigator {
    fun redirectToOfferList(context: Context, firstParam: String? = null)
}