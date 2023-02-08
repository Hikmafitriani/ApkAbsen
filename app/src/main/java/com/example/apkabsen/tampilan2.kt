package com.example.apkabsen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class tampilan2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan2)
    }

    fun hal2 (view: View){
        val NEXT = Intent(this,HlmnHariTgl::class.java)
        startActivity(NEXT)
    }
}