package com.hsh.navigation.navigator.provider

import com.hsh.navigation.Navigation
import com.hsh.navigation.navigator.MainNavigator
import com.hsh.navigation.navigator.OfferNavigator
import dagger.hilt.android.EntryPointAccessors
import javax.inject.Inject


class NavigatorStore @Inject constructor(
    private val mainNavigator: MainNavigator,
    private val offerNavigator: OfferNavigator
) {

    fun getMainNavigator() = mainNavigator

    fun getOfferNavigator() = offerNavigator

    companion object {
        private var instance: NavigatorStore? = null
        fun getInstance(): NavigatorStore? {
            return Navigation.getContext()?.let { application ->
                instance ?: EntryPointAccessors.fromApplication(
                    application,
                    StoreAccessor::class.java
                ).getNavigatorStore().also {
                    instance = it
                }
            }
        }
    }
}