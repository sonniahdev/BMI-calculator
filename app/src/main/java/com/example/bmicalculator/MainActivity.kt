package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var weightEditText: EditText
    private lateinit var heightEditText: EditText
    private lateinit var calculateButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        weightEditText = findViewById(R.id.editText1)
        heightEditText = findViewById(R.id.editText2)
        calculateButton = findViewById(R.id.btncalculate)
        resultTextView = findViewById(R.id.textView)

        calculateButton.setOnClickListener {
            calculateBMI()

        }
    }

    private fun calculateBMI() {
        val weightStr = weightEditText.text.toString()
        val heightStr = heightEditText.text.toString()

        if (weightStr.isNotEmpty() && heightStr.isNotEmpty()) {
            val weight = weightStr.toFloat()
            val height = heightStr.toFloat()
            val bmi = weight / (height * height)
            Toast.makeText(this, "your BMI is$bmi", Toast.LENGTH_SHORT).show()

            resultTextView.text = "Your BMI: $bmi"

        } else {
            resultTextView.text = "Please enter weight and height."

        }
      }
    }


