package com.example.meningloyihamchecbox


import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    @SuppressLint("CommitPrefEdits")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sharedPreferences = getSharedPreferences("text1", Context.MODE_PRIVATE)
        var arraylist = ArrayList<String>()


        btn_next.setOnClickListener {
            val name = edit_txt_1.text.toString().trim()
            val password = edit_txt_2.text.toString().trim()

            val editor = sharedPreferences.edit()
            if (name.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Ma'lumotlar kiritilmagan", Toast.LENGTH_SHORT).show()
            } else {
                arraylist.add(" $name \n $password")
                editor.putString("name","$arraylist\n")
            }
            editor.apply()


            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            edit_txt_1.text.clear()
            edit_txt_2.text.clear()
        }

        btn_save.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }

    /* override fun onStart() {
         super.onStart()
         root.setBackgroundColor(resources.getColor(My_color.color))
     }*/
}

