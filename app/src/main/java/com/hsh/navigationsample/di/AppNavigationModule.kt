package com.hsh.navigationsample.di

import com.hsh.navigation.navigator.MainNavigator
import com.hsh.navigation.navigator.OfferNavigator
import com.hsh.navigationsample.ui.MainNavigatorImpl
import com.hsh.offer.OfferNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class AppNavigationModule {
    @Binds
    @Singleton
    abstract fun bindMainNavigator(navigator: MainNavigatorImpl): MainNavigator

    @Binds
    @Singleton
    abstract fun bindOfferNavigator(navigator: OfferNavigatorImpl): OfferNavigator
}