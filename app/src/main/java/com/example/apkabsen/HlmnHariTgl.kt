package com.example.apkabsen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HlmnHariTgl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hlmn_hari_tgl)
    }

    fun hal (view: View){
        val intent=Intent(this,tampilan3::class.java)
        startActivity(intent)
    }
}