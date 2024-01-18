class MainActivityIntentBuilder : ActivityIntentBuilder<MainActivityIntentBuilder>() {

    private var param: String? = null

    override fun addExtras(intent: Intent) {
        param?.let {
            intent.putExtra(EXTRA_SELECTED_CATEGORY_ID, it)
        }
    }

    override fun provideClass(): Class<*> {
        return MainActivity::class.java
    }

    fun setFirstParam(): MainActivityIntentBuilder {
        this.requiredUpdate = flag
        return this
    }

    companion object {
        const val first_param = "first_param"
    }
}