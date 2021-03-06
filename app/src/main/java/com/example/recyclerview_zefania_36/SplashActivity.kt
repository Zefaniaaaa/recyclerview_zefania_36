package com.example.recyclerview_zefania_36

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.recyclerview_ryuzaalysyahputra_29.R

class SplashActivity : AppCompatActivity() {
    private val SPLASH_TIME:Long = 5000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent (this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME)
    }
}