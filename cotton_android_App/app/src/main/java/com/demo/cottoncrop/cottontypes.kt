package com.demo.cottoncrop

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class cottontypes : AppCompatActivity() {
    var listView: ListView? = null
    var textView: TextView? = null
    var textView2: TextView? = null
    var listofcottons: ArrayList<String>? = null
    var arrayAdapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cottontypes)
        listView = findViewById(R.id.listview)
        textView = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)
        listofcottons = java.util.ArrayList()
        listofcottons!!.add("J-34")
        listofcottons!!.add("H-4")
        listofcottons!!.add("S-6")
        listofcottons!!.add("DCH-32")
        listofcottons!!.add("BUNNY BRAHMA")
        listofcottons!!.add("BENGALI DESHI")
        listofcottons!!.add("V 797")

        arrayAdapter = ArrayAdapter<String>(
            applicationContext, android.R.layout.simple_list_item_1,
            listofcottons!!
        )
        listView?.setAdapter(arrayAdapter)
        listView?.setOnItemClickListener(OnItemClickListener { parent, view, position, id ->
            val intent = Intent(applicationContext, typeinfo::class.java)
            intent.putExtra("Type", position)
            finish()
            startActivity(intent)
        })
    }
}