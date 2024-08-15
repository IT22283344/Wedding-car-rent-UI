package com.example.loveweddingcar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var signinhome=findViewById<Button>(R.id.signinhome)
        signinhome.setOnClickListener{
            var intentsignin=Intent(this,Homepage::class.java)
            startActivity(intentsignin)
        }
    }
}