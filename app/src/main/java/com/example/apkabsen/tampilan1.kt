package com.example.apkabsen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class tampilan1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan1)
        WindowManager.LayoutParams.FLAG_FULLSCREEN
        WindowManager.LayoutParams.FLAG_FULLSCREEN

        Handler().postDelayed({
            val intent = Intent(this,tampilan2::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}