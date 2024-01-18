package com.hsh.navigationsample.ui

import android.content.Intent

class MainActivityIntentBuilder : com.hsh.common.ActivityIntentBuilder<MainActivityIntentBuilder>() {

    private var param: String? = null

    override fun addExtras(intent: Intent) {
        param?.let {
            intent.putExtra(first_param, it)
        }
    }

    override fun provideClass(): Class<*> {
        return MainActivity::class.java
    }

    fun setFirstParam(firstParam: String): MainActivityIntentBuilder {
        this.param = firstParam
        return this
    }

    companion object {
        const val first_param = "first_param"
    }
}