package com.hsh.navigationsample.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hsh.navigationsample.R
import com.hsh.search.SearchActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToSearchActivity()
        Log.d("TEST","MainActivity onCreate")
    }

    private fun goToSearchActivity() {
        val intent = Intent(this, SearchActivity::class.java)
        startActivity(intent)
    }
}