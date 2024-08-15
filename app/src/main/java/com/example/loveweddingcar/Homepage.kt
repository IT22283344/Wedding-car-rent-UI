package com.example.loveweddingcar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

       var profilebutton=findViewById<ImageButton>(R.id.profilebtn)
        profilebutton.setOnClickListener{
            var goprfile=Intent(this,ProfileA::class.java)
            startActivity(goprfile)
        }


        var bmw1=findViewById<CardView>(R.id.bmw1)
        bmw1.setOnClickListener{
            var gobmwdetails=Intent(this,Cardetails02::class.java)
            startActivity(gobmwdetails)
        }

        var benz1=findViewById<CardView>(R.id.benz1)
        benz1.setOnClickListener{
            var gobenz1details=Intent(this,Cardetails02::class.java)
            startActivity(gobenz1details)
        }



    }
}