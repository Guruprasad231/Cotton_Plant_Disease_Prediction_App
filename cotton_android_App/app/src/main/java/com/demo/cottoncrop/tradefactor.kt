package com.demo.cottoncrop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class tradefactor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tradefactor)
        var multiline:EditText = findViewById(R.id.editTextfactors)
        multiline.setText(
            "In the context of International cotton scenario, India now plays a predominant role: India is –\n" +
                    "\n" +
                    "*Largest cotton cultivator in the world\n" +
                    "*Second largest producer of cotton\n" +
                    "*Second largest consumer of cotton\n" +
                    "*Second largest exporter of cotton\n" +
                    "\n" +
                    "Cotton prices: The top 10 most important drivers\n" +
                    "1) Economic growth\n" +
                    "2) Government policies\n" +
                    "3) The weather\n" +
                    "4) Chinese stock-building\n" +
                    "5) The price of synthetic fibres\n" +
                    "6) Oil prices\n" +
                    "7) The US dollar\n" +
                    "8) The price of competing crops\n" +
                    "9) Main producers\n" +
                    "10) Seasonal factors\n"+
                    "----------------------------------------------"
        )
    }

//    override fun onBackPressed() {
//        super.onBackPressed()
//        finish()
//        startActivity(Intent(applicationContext, Demo::class.java))
//    }
    }
