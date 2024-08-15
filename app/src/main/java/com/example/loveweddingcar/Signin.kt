package com.example.loveweddingcar

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signin : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        //sign in to home
        var signuphome=findViewById<Button>(R.id.signuphome)
        signuphome.setOnClickListener{
            var intentsignup=Intent(this,Homepage::class.java)
            startActivity(intentsignup)
        }
    }
}