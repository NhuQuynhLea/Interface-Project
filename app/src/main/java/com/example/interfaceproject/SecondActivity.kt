package com.example.interfaceproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        supportFragmentManager.beginTransaction().replace(R.id.container, HomeFragment()).commit()
    }
}