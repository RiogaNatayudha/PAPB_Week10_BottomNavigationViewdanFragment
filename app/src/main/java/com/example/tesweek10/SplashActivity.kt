package com.example.tesweek10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper()).postDelayed({
            // Setelah 3 detik, pindahkan ke WelcomingPageActivity
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, 3000)
    }
}