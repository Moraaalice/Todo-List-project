package com.example.moraatodolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moraatodolist.databinding.ActivityMain2Binding
import com.example.moraatodolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        binding.button.setOnClickListener {
            val intent = Intent(this,ActivityMain2Binding::class.java)
            startActivity(intent)
        }
    }
}