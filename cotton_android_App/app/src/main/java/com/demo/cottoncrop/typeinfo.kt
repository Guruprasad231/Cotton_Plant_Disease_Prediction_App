package com.demo.cottoncrop

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class typeinfo : AppCompatActivity() {
    var multilinetextview: TextView? = null
    var textView3: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_typeinfo)
        multilinetextview = findViewById(R.id.multilinetext)
        textView3 = findViewById(R.id.textView3)
        textView3?.setInputType(InputType.TYPE_NULL)
        textView3?.setText("")
        multilinetextview?.setText("")
        val intent = intent
        val type = intent.getIntExtra("Type", 0)

        when (type) {
            0 -> {
                textView3?.setText("J-34")
                multilinetextview?.setText(
                    "*Commonly known as ROLLED cotton \n" +
                            "*standard (ICS-106)\n" +
                            "*largly produced in punjab haryana rajasthan\n" +
                            "*Good dye absorption \n" +
                            "*High trash"
                )
            }
            1 -> {
                textView3?.setText("H-4")
                multilinetextview?.setText(
                    ("*commonly known as Hybrid 4\n" +
                            "*standard (ICS-105)\n" +
                            "*largly produced in gujrat maharastra Madhya pradesh\n" +
                            "*low water absorption,better tribiological properties\n" +
                            "*expensive seed")
                )
            }
            2 -> {
                textView3?.setText("S-6")
                multilinetextview?.setText(
                    ("*commonly known as shankar-6\n" +
                            "*commonly known as Hybrid 4\n" +
                            "*standard (ICS-110)\n" +
                            "*only produced in gujrat\n" +
                            "*high demand across global market \n" +
                            "*production limited to certain area")
                )
            }
            3 -> {
                textView3?.setText("DCH-32")
                multilinetextview?.setText(
                    ("*commonl known as Dhaward cotton hybrid No.32\n" +
                            "*standard (ICS-113)\n" +
                            "* produced in MP,maharastra,Tamil nadu,oddisha\n" +
                            "*has very strength \n" +
                            "*minimum fabric rapture")
                )
            }
            4 -> {
                textView3?.setText("BUNNY BRAHMA")
                multilinetextview?.setText(
                    ("*commonly known as Bunny/brahma\n" +
                            "*standard (ICS-111)\n" +
                            "*only produced in Maharastra,karnattka,Tamil nadu\n" +
                            "*can bear extreme climate change\n" +
                            "*provide good strength thus use in weaving")
                )
            }
            5 -> {
                textView3?.setText("BENGALI DESHI")
                multilinetextview?.setText(
                    ("*also known as absorbent cotton\n" +
                            "*standard (ICS-101)\n" +
                            "*produced in UP,Assam,Rajasthan \n" +
                            "*Low cost \n" +
                            "*High demand in Europe")
                )

            }
            6 -> {
                textView3?.setText("V 797")
                multilinetextview?.setText(
                    ("*also known as Gossypium hersaccum\n" +
                            "*standard (ICS-103)\n" +
                            "*mainly produced in gujrat\n" +
                            "*cheap and demanded globally and locally\n" +
                            "*limited area of production")
                )
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        startActivity(Intent(applicationContext, cottontypes::class.java))
    }
    }
