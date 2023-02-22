package com.example.apkabsen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class tampilan3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan3)
    }

    fun tampilan3 (view: View){
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    fun tamp3 (view: View){
        val intent=Intent(this,HlmnHariTgl::class.java)
        startActivity(intent)
    }
}