package com.example.interfaceproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var signInButton = findViewById<Button>(R.id.buttonSignIn)
        signInButton.setOnClickListener(){
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

}