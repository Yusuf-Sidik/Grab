package com.example.grab4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.logging.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()
        Thread{
            Thread.sleep(200)
            runOnUiThread{
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }.start()
    }
}