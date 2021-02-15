package com.example.simplecalcforbeginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var n1 = 0
        var n2 = 0
        var str = "Result = "
        fun setNum() {
            n1 = txt1.text.toString().toInt()
            n2 = txt2.text.toString().toInt()
        }


        btnAdd.setOnClickListener {
            setNum(); txtR.text = (n1 + n2).toString()
            var add = str + txtR.text.toString()
            Toast.makeText(this@MainActivity, add, Toast.LENGTH_SHORT).show()
        }
        btnSub.setOnClickListener {
            setNum(); txtR.text = (n1 - n2).toString()
            var sub = str + txtR.text.toString()
            Toast.makeText(this@MainActivity, sub, Toast.LENGTH_SHORT).show()
        }
        btnMulti.setOnClickListener {
            setNum(); txtR.text = (n1 * n2).toString()
            var multi = str + txtR.text.toString()
            Toast.makeText(this@MainActivity, multi, Toast.LENGTH_SHORT).show()
        }
        btnDiv.setOnClickListener {
            setNum(); txtR.text = (n1 / n2).toString()
            var div = str + txtR.text.toString()
            Toast.makeText(this@MainActivity, div, Toast.LENGTH_SHORT).show()
        }




    }
}