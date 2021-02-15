package com.example.simplecalcforbeginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var n1 = 0
        var n2 = 0

        fun setNum() {
            n1 = txt1.text.toString().toInt()
            n2 = txt2.text.toString().toInt()
        }





    }
}