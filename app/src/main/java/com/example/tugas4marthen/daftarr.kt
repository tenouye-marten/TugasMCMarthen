package com.example.tugas4marthen

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas4marthen.databinding.ActivityDaftarrBinding

class daftarr : AppCompatActivity() {
    private lateinit var binding: ActivityDaftarrBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_daftarr)

        binding = ActivityDaftarrBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val intenthome = Intent(this, Home::class.java)
            startActivity(intenthome)
        }

        binding.login.setOnClickListener {
            val intenthome = Intent(this, MainActivity::class.java)
            startActivity(intenthome)
        }
    }
}