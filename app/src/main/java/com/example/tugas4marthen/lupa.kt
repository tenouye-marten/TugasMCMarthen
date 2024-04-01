package com.example.tugas4marthen

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas4marthen.databinding.ActivityLupaBinding
import com.example.tugas4marthen.databinding.ActivityMainBinding

class lupa : AppCompatActivity() {
    private lateinit var binding: ActivityLupaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_lupa)

        binding = ActivityLupaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val intenthome = Intent(this, Home::class.java)
            startActivity(intenthome)
        }
    }
}