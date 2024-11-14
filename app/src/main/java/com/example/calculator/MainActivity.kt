package com.example.calculator

import android.os.Binder
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val txtDisplayValue1 = ""
//        val operator = ""
//        val txtDisplayValue2 = ""
//
//        val items = mutableListOf<String>()
//
//        fun add(): Int
//        {
//            val sum = txtDisplayValue1.toInt() + txtDisplayValue2.toInt()
//            return sum
//        }
//
//        fun subtract(): Int
//        {
//            val difference = txtDisplayValue1.toInt() - txtDisplayValue2.toInt()
//            return difference
//        }
//
//        fun multiply(): Int
//        {
//            val product = txtDisplayValue1.toInt() * txtDisplayValue2.toInt()
//            return product
//        }
//
//        fun divide(): Int
//        {
//            val quotient = txtDisplayValue1.toInt() / txtDisplayValue2.toInt()
//            return quotient
//        }
//
//
//        binding.txtDisplay.text = "0"
//
//        binding.apply {
//
//            btn0.setOnClickListener{
//                txtDisplay.text = "0"
//            }
//
//            btn1.setOnClickListener{
//                txtDisplay.text = "1"
//            }
//
//            btn2.setOnClickListener{
//                txtDisplay.text = "2"
//            }
//
//            btn3.setOnClickListener{
//                txtDisplay.text = "3"
//            }
//            btn4.setOnClickListener{
//                txtDisplay.text = "4"
//            }
//            btn5.setOnClickListener{
//                txtDisplay.text = "5"
//            }
//            btn6.setOnClickListener{
//                txtDisplay.text = "6"
//            }
//            btn7.setOnClickListener{
//                txtDisplay.text = "7"
//            }
//            btn8.setOnClickListener{
//                txtDisplay.text = "8"
//            }
//            btn9.setOnClickListener{
//                txtDisplay.text = "9"
//            }
//
//            btnAdd.setOnClickListener{
//                txtDisplay.text = "+"
//            }
//            btnSubtract.setOnClickListener{
//                txtDisplay.text = "-"
//            }
//            btnMultiply.setOnClickListener{
//                txtDisplay.text = "*"
//            }
//            btnDivide.setOnClickListener{
//                txtDisplay.text = "/"
//            }
//
//            btnEquals.setOnClickListener{
//                txtDisplay.text = "="
//            }
//            btnDelete.setOnClickListener{
//                txtDisplay.text = ""
//            }
//        }

        //val numbers = mutableListOf<String>()

        binding.calculate.setOnClickListener{
            var editTextValue1 = binding.editText1.text.toString().toInt()
            var operator = binding.operator.text.toString()
            var editTextValue2 = binding.editText2.text.toString().toInt()
            //numbers.add(editTextValue1.toString())

            Log.i("TAG", editTextValue1.toString())
            Log.i("TAG", operator)
            Log.i("TAG", editTextValue2.toString())

            if(operator == "+")
            {
                val sum = editTextValue1 + editTextValue2
                //numbers.add(sum.toString())
                binding.txtDisplay.text = sum.toString()
            }
            else if(operator == "-")
            {
                val difference = editTextValue1 - editTextValue2
                //numbers.add(difference.toString())
                binding.txtDisplay.text = difference.toString()
            }
            else if(operator == "*")
            {
                val product = editTextValue1 * editTextValue2
                //numbers.add(product.toString())
                binding.txtDisplay.text = product.toString()
            }
            else if(operator == "/")
            {
                val quotient = editTextValue1 / editTextValue2
                //numbers.add(quotient.toString())
                binding.txtDisplay.text = quotient.toString()
            }

        }
    }
}