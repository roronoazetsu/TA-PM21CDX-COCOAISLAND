package com.example.penyewaan_papan_surfing

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

abstract class MainActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val btn_login: Button = findViewById(R.id.btn_sewapapan)
        val btn_register: Button = findViewById(R.id.btn_Dafrtarpapan)
        btn_login.setOnClickListener(this)
        btn_register.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_sewapapan -> {
                val intent = Intent(this@MainActivity, sewapapandActivity::class.java)
                startActivity(intent)
            }

            R.id.btn_Dafrtarpapan -> {
                val intent = Intent(this@MainActivity, Daftarpapan::class.java)
                startActivity(intent)
            }
        }
    }
}

