package com.example.tugas4marthen
import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.tugas4marthen.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    //    private lateinit var binding: ActivityMainBinding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val intenthome = Intent(this, Home::class.java)
            startActivity(intenthome)
        }

        binding.lupaPassword.setOnClickListener {
            val intentLupaPassword = Intent(this, lupa::class.java)
            startActivity(intentLupaPassword)
        }

        binding.daftar.setOnClickListener {
            val intentDaftar = Intent(this, daftarr::class.java)
            startActivity(intentDaftar)
        }



    }

    }
