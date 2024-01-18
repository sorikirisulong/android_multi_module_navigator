package com.hsh.common

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle

abstract class BaseIntentBuilder<T : BaseIntentBuilder<T>> {
    private var flags = 0
    private var bundleExtra: Bundle? = null
    private var data: Uri? = null
    private var action: String? = null

    /**
     * Provide the class of the component at implementation time, explicit 'Intent'. If not, it is an implicit 'intent'.
     *
     * @return The component's class
     */
    protected abstract fun provideClass(): Class<*>
    /**
     * The implementation should add to this Intent the extras needed to start the component
     *
     * @param intent The built intent
     */
    protected abstract fun addExtras(intent: Intent)

    /**
     * Starts the component with the Intent build with this Intent Builder
     */
    abstract fun start(context: Context?)

    /**
     * Creates a new intent with the specified component class, extras, flags and bundle
     *
     * @return A new instance of Intent
     */
    fun build(context: Context): Intent {
        val intent = Intent()

        //A new Intent's flags are initially equal to 0
        intent.flags = flags
        if (bundleExtra != null) {
            intent.putExtras(bundleExtra!!)
        }
        if (data != null) {
            intent.data = data
        }
        if (!action.isNullOrEmpty()) {
            intent.action = action
        }
        addExtras(intent)
        if (provideClass() != null) {
            intent.setClass(context, provideClass())
        }
        return intent
    }

    /**
     * Adds flags to the intent's flags
     * @param flags flags to add to the intent
     * @return This IntentBuilder for method chaining
     */
    @Suppress("UNCHECKED_CAST")
    fun addFlags(flags: Int): T {
        this.flags = this.flags or flags
        return this as T
    }

    /**
     * Sets flags to the intent.
     * The flag previously set to the builder will be overridden. Any flags set to the Activity in the AndroidManifest.xml will also be overridden.
     *
     * @param flags flags to set to the intent
     * @return This IntentBuilder for method chaining
     */
    @Suppress("UNCHECKED_CAST")
    fun setFlags(flags: Int): T {
        this.flags = flags
        return this as T
    }

    /**
     * Sets the bundle to put into the intent's extras
     * @param bundleExtra bundle to put in the intent's extras
     * @return This IntentBuilder for method chaining
     */
    @Suppress("UNCHECKED_CAST")
    fun bundleExtra(bundleExtra: Bundle?): T {
        this.bundleExtra = bundleExtra
        return this as T
    }

    /**
     * Set the data this intent is operating on.
     * @param data The data this intent is operating on.
     * @return This IntentBuilder for method chaining
     */
    @Suppress("UNCHECKED_CAST")
    fun data(data: Uri?): T {
        this.data = data
        return this as T
    }

    /**
     * Set the general action to be performed.
     * @param action The general action to be performed.
     * @return This IntentBuilder for method chaining
     */
    @Suppress("UNCHECKED_CAST")
    fun action(action: String?): T {
        this.action = action
        return this as T
    }
}
