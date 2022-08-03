package com.demo.cottoncrop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Demo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        var btnpred: Button = findViewById(R.id.btnpred)
        btnpred.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        var tradefact: Button = findViewById(R.id.trade)
        tradefact.setOnClickListener{
            val intent=Intent(this,tradefactor::class.java)
            startActivity(intent)
        }

        var typbtn: Button = findViewById(R.id.typbtn)
        typbtn.setOnClickListener{
            val intent=Intent(this,cottontypes::class.java)
            startActivity(intent)
        }

        var prodbtn: Button = findViewById(R.id.prodbtn)
        prodbtn.setOnClickListener{
            val intent=Intent(this,Production::class.java)
            startActivity(intent)
        }
    }
}