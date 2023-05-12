package com.example.clubmaster.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clubmaster.R

class RateApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rate_app)
        showRateFeedbackDialog()
    }
    private fun showRateFeedbackDialog() {

    }
}