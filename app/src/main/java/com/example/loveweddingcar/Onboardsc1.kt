package com.example.loveweddingcar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Onboardsc1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboardsc1)

        //sign in button
        var inbtn =findViewById<Button>(R.id.inbtn)
        inbtn.setOnClickListener{
            val gosignin= Intent(this,Signup::class.java)
            startActivity(gosignin)
        }


        //sign up button
        var upbtn =findViewById<Button>(R.id.upbtn)
        upbtn.setOnClickListener{
            val gosignup= Intent(this,Signin::class.java)
            startActivity(gosignup)
        }
    }
}