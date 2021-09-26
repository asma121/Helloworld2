package com.example.helloworld2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun checkNum(n:String): Float{
            try {
                return n.toFloat()
            }catch (e:Exception){
                Log.d("MainActivity","please enter a number")
            }
            return 0f
        }

        fun calculation(num1: Float, oper: String, num2: Float) : Float {
            var result=0f
            if (oper == "+") {
                result= num1 + num2
            } else if (oper == "-") {
                result= num1 - num2
            } else if (oper == "*") {
                result= num1 * num2
            } else if (oper == "/") {
                if (num2 == 0f) {
                    Log.d("MainActivity", "you can not divide by 0")
                } else {
                    result= num1 / num2
                }

            }
            return result
        }

        Log.d("MainActivity"," the result is ${calculation(5f,"*",12f)}")


    }
}