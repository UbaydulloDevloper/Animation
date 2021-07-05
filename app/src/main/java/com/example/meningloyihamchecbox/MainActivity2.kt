package com.example.meningloyihamchecbox

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    var arrayList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val shtext = applicationContext.getSharedPreferences("text1", Context.MODE_PRIVATE)
        shtext.getString("name","")?.let { arrayList.add(it) }

       val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList)
        lv.adapter = adapter



    }
}