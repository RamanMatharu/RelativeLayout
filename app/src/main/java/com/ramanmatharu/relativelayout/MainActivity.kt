package com.ramanmatharu.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Integer.getInteger

class MainActivity : AppCompatActivity() {

    lateinit var number: TextView
    lateinit var add: Button
    lateinit var sub: Button
    lateinit var mul: Button
    lateinit var div: Button
    lateinit var numSpace : EditText
    lateinit var numSecSpace : EditText
    lateinit var history : Button
    lateinit var clear : Button
    var res = 0
    var firstNum = 0
    var secNum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number = findViewById(R.id.number)
        add = findViewById(R.id.add)
        sub = findViewById(R.id.sub)
        mul = findViewById(R.id.mul)
        div = findViewById(R.id.div)
        numSpace = findViewById(R.id.numSpace)
        numSecSpace = findViewById(R.id.numSecSpace)
        history = findViewById(R.id.history)
        clear = findViewById(R.id.clear)

        number.text = res.toString()

        add.setOnClickListener {
            firstNum = numSpace.text.toString().toInt()
            secNum = numSecSpace.text.toString().toInt()
            res = firstNum + secNum
            number.text = res.toString()
        }

        sub.setOnClickListener {
            firstNum = numSpace.text.toString().toInt()
            secNum = numSecSpace.text.toString().toInt()
            res = firstNum - secNum
            number.text = res.toString()
        }

        mul.setOnClickListener {
            firstNum = numSpace.text.toString().toInt()
            secNum = numSecSpace.text.toString().toInt()
            res = firstNum * secNum
            number.text = res.toString()
        }

        div.setOnClickListener {
            firstNum = numSpace.text.toString().toInt()
            secNum = numSecSpace.text.toString().toInt()
            res = firstNum / secNum
            number.text = res.toString()
        }

        clear.setOnClickListener {
            res = 0
            numSpace.text.clear()
            numSecSpace.text.clear()
            number.text = res.toString()
        }
    }
}



