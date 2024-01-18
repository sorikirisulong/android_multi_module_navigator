package com.hsh.search

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.hsh.navigation.navigator.provider.NavigatorStore

class SearchActivity : AppCompatActivity() {
    private val offerNavigator = NavigatorStore.getInstance()?.getOfferNavigator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        Log.d("TEST","SearchActivity onCreate")
        goToOfferActivity()
    }

    private fun goToOfferActivity() {
        offerNavigator?.redirectToOfferList(this, "called from SearchActivity")
    }
}