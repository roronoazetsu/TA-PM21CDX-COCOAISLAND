package com.example.penyewaan_papan_surfing

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
data class SurfboardActivity(
    val id: String,
    val brand: String,
    val model: String,
    val length: Double,
    val width: Double,
    val thickness: Double,
    val volume: Double,
    val material: String,
    val finSetup: String,
    val price: Double,
    val description: String
)
