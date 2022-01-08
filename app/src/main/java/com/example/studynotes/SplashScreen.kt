package com.example.studynotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.delay

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //action bar hide
        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            //code
            startActivity(Intent(this, MainActivity::class.java))

        }, 2000)

    }

}




