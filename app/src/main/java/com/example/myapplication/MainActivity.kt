package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //gg
    lateinit var ButtonPlus:Button
    lateinit var ButtonMinus:Button
    lateinit var ButtonMul:Button
    lateinit var ButtonDiv:Button
    lateinit var ButtonResult:Button
    lateinit var TextNumber:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView();
    }

    private fun initView() {
        ButtonPlus =findViewById(R.id.appCompatButton2)
        ButtonMinus =findViewById(R.id.appCompatButton3)
        ButtonMul =findViewById(R.id.appCompatButton4)
        ButtonDiv =findViewById(R.id.appCompatButton5)
        ButtonResult =findViewById(R.id.appCompatButton16)
        TextNumber = findViewById(R.id.textView2)

    }
    fun onClick(v: View){

        val newDigit = (v as Button).text.toString()
        val oldDigits= TextNumber.text.toString()
        val newTextNumbers = oldDigits + newDigit
        TextNumber.text = newTextNumbers
    }
    fun onClickResult(v: View){

        val ResultString = TextNumber.text.toString()
        val oldDigits= TextNumber.text.toString()
        if(ResultString.length == 3){
            var num1= ResultString.get(0).digitToInt()
            var num2= ResultString.get(2).digitToInt()
            var opr= ResultString.get(1)
            when (opr){
                '+' -> num1=num1+num2
                '-' -> num1=num1-num2
                '*' -> num1=num1*num2
                '/' -> num1=num1/num2
                '%' -> num1=num1%num2
            }
            TextNumber.text = num1.toString()
        }
        else{
            TextNumber.text = ""
        }
    }
    fun onClickClear(v: View){
        TextNumber.text = ""
    }
}