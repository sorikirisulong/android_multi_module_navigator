package com.hsh.offer

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class OfferActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer)
        Log.d("TEST", "OfferActivity  onCreate -> ${intent.getStringExtra("first_param")}")
    }
}