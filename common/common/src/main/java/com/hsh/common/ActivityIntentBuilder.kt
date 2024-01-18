package com.hsh.common

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.annotation.AnimRes
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment

abstract class ActivityIntentBuilder<T : BaseIntentBuilder<T>> : BaseIntentBuilder<T>() {
    @AnimRes
    private var enterAnim = -1
    @AnimRes
    private var exitAnim = -1
    private var activityOptions: Bundle? = null

    override fun start(context: Context?) {
        if (context is Activity) {
            start(context as Activity?)
        } else {
            context?.startActivity(build(context), activityOptions)
        }
    }

    private fun start(activity: Activity?) {
        if (activity != null) {
            ActivityCompat.startActivity(activity, build(activity), activityOptions)
            overridePendingTransition(activity, enterAnim, exitAnim)
        }
    }

    fun startForResult(activity: Activity?, requestCode: Int) {
        if (activity != null) {
            ActivityCompat.startActivityForResult(activity, build(activity), requestCode, activityOptions)
            overridePendingTransition(activity, enterAnim, exitAnim)
        }
    }

    fun startFromFragment(fragment: Fragment?) {
        if (fragment != null && fragment.activity != null) {
            fragment.startActivity(build(fragment.requireActivity()), activityOptions)
            overridePendingTransition(fragment.requireActivity(), enterAnim, exitAnim)
        }
    }

    fun startFromFragmentForResult(fragment: Fragment?, requestCode: Int) {
        if (fragment != null && fragment.activity != null) {
            ActivityCompat.startActivityForResult(fragment.requireActivity(), build(fragment.requireActivity()), requestCode, activityOptions)
            overridePendingTransition(fragment.requireActivity(), enterAnim, exitAnim)
        }
    }

    private fun overridePendingTransition(activity: Activity, enterAnim: Int, exitAnim: Int) {
        if (enterAnim >= 0 && exitAnim >= 0) {
            activity.overridePendingTransition(enterAnim, exitAnim)
        }
    }

    /**
     * Specify an explicit transition animation to perform next.
     * @param enterAnim A resource ID of the animation resource to use for
     * the incoming activity.  Use 0 for no animation.
     * @param exitAnim A resource ID of the animation resource to use for
     * the outgoing activity.  Use 0 for no animation.
     * @return This IntentBuilder for method chaining
     */
    @Suppress("UNCHECKED_CAST")
    fun overridePendingTransition(@AnimRes enterAnim: Int, @AnimRes exitAnim: Int): T {
        this.enterAnim = enterAnim
        this.exitAnim = exitAnim
        return this as T
    }

    @Suppress("UNCHECKED_CAST")
    fun activityOptions(activityOptions: Bundle?): T {
        this.activityOptions = activityOptions
        return this as T
    }
}
