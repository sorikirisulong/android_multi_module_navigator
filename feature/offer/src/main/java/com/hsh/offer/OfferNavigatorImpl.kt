package com.hsh.offer

import android.content.Context
import com.hsh.navigation.navigator.OfferNavigator

import javax.inject.Inject

class OfferNavigatorImpl @Inject constructor() : OfferNavigator {
    override fun redirectToOfferList(context: Context, firstParam: String?) {
        OfferListIntentBuilder().setFirstParam(firstParam.orEmpty()).start(context)
    }
}