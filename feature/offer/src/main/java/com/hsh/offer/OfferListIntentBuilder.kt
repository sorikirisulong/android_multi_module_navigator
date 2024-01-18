package com.hsh.offer

import android.content.Intent
import com.hsh.common.ActivityIntentBuilder

class OfferListIntentBuilder : ActivityIntentBuilder<OfferListIntentBuilder>() {

    private var param: String? = null

    override fun addExtras(intent: Intent) {
        param?.let {
            intent.putExtra(first_param, it)
        }
    }

    override fun provideClass(): Class<*> {
        return OfferActivity::class.java
    }

    fun setFirstParam(firstParam: String): OfferListIntentBuilder {
        this.param = firstParam
        return this
    }

    companion object {
        const val first_param = "first_param"
    }
}