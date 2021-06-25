package com.example.meningloyihamchecbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animationType_1 = AnimationUtils.loadAnimation(this,R.anim.alfa_anim)
        val animationType_2 = AnimationUtils.loadAnimation(this,R.anim.scale)
        val animationType_3 = AnimationUtils.loadAnimation(this,R.anim.rotate)
        val animationType_4 = AnimationUtils.loadAnimation(this,R.anim.transletor)
        //txt.startAnimation(animationType)
        btn_alfa.setOnClickListener {
            txt.startAnimation(animationType_1)
        }
        btn_scale.setOnClickListener {
            txt.startAnimation(animationType_2)

        }
        btn_rotate.setOnClickListener {
            txt.startAnimation(animationType_3)
        }
        btn_transletor.setOnClickListener {
            txt.startAnimation(animationType_4)
        }


    }


}