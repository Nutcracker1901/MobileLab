package com.example.mobilelab

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val SPLASH_TIME_OUT: Long = 3000

        Handler().postDelayed(Runnable {
            val intent = Intent(this@MainActivity, MainActivity::class.java)
            startActivity(intent)

            finish()
        }, SPLASH_TIME_OUT)

    }
}