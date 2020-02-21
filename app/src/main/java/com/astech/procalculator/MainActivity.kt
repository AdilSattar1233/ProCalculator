package com.astech.procalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mDisplayResult : TextView
    private lateinit var mCancel : ImageButton
    private lateinit var mBtnOne : ImageButton
    private lateinit var mBtnTwo : ImageButton
    private lateinit var mBtnThree : ImageButton
    private lateinit var mBtnFour : ImageButton
    private lateinit var mBtnFive : ImageButton
    private lateinit var mBtnSix : ImageButton
    private lateinit var mBtnSeven : ImageButton
    private lateinit var mBtnEight : ImageButton
    private lateinit var mBtnNine : ImageButton
    private lateinit var mBtnZero : ImageButton
    private lateinit var mBtnPlus : ImageButton
    private lateinit var mBtnMinus : ImageButton
    private lateinit var mBtnMultiply : ImageButton
    private lateinit var mBtnDivide : ImageButton
    private lateinit var mBtnDot : ImageButton
    private lateinit var mBtnEqual : ImageButton
    private var result : Double = 0.0

    



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /****
         * Methods
         */

        init()

    }

    //Todo button event handling
    fun btnClick(view: View) {
        when(view.id){

            R.id.btnOne -> {
                Log.d("TAG" , "One")
                displayResult(mBtnOne)

            }
            R.id.btnTwo -> {
                Log.d("TAG", "Two")
                displayResult(mBtnTwo)
            }
            R.id.btnThree -> {
                Log.d("TAG", "Three")
                displayResult(mBtnThree)
            }
            R.id.btnFour -> {
                Log.d("TAG" , "Four")
                displayResult(mBtnFour)
            }
            R.id.btnFive -> {
                Log.d("TAG" , "Five")
                displayResult(mBtnFive)
            }
            R.id.btnSix -> {
                Log.d("TAG" , "Six")
                displayResult(mBtnSix)
            }
            R.id.btnSeven -> {
                Log.d("TAG" , "Seven")
                displayResult(mBtnSeven)
            }
            R.id.btnEight -> {
                Log.d("TAG" , "Eight")
                displayResult(mBtnEight)
            }
            R.id.btnNine -> {
                Log.d("TAG" , "Nine")
                displayResult(mBtnNine)
            }

            R.id.btnZero ->{
                Log.d("TAG" , "Zero")
                displayResult(mBtnZero)
            }
            R.id.btnEqual -> {
                Log.d("TAG" , "Equal")
                val myArray = mDisplayResult.text.toString().toCharArray()

                for (item in myArray){
                    Log.d("TAG" , "$item")

                    if (item != '+'){
                       // mDisplayResult.append("\n= $item" )
                        result += item.toDouble()
                    }else{

                    }


                }




                //Toast.makeText(applicationContext , myArray[0].toString() , Toast.LENGTH_SHORT).show()

            }

            R.id.btnPlus -> {
                Log.d("TAG" , "Plus")
                displayResult(mBtnPlus)
            }
            R.id.btnMinus -> {
                Log.d("TAG" , "Minus")
                displayResult(mBtnMinus)
            }


            R.id.btnMultiply ->{
                Log.d("TAG" , "Multiply")
                displayResult(mBtnMultiply)
            }
            R.id.btnDot ->{
                Log.d("TAG" , "Dot")
                displayResult(mBtnDot)
            }

            R.id.btnCancel ->{
                Log.d("TAG" , "Cancel")

            }


            R.id.btnBackspace -> {
                Log.d("TAG" , "Back Space Click")
                val displayValue : String = mDisplayResult.text.toString()
                if(displayValue.isNotEmpty()){
                    removeLastCharacter(mDisplayResult.text.toString())
                }

            }

            //Todo this one default selection
            else -> {
                Log.d("TAG" , "wrong click")
            }

        }
    }

    private fun displayResult(btn: ImageButton){
        val value = btn.tag.toString()
        Log.d("TAG" , value)

        mDisplayResult.append("$value")
        mDisplayResult.movementMethod = ScrollingMovementMethod()

    }

    private fun removeLastCharacter(oldValue : String){
        mDisplayResult.text = oldValue.substring(0 , oldValue.lastIndex)
    }


    private fun init(){
        /***
         * Initialize components here
         */

        mDisplayResult = findViewById(R.id.displayResult)
        mBtnOne = findViewById(R.id.btnOne)
        mBtnTwo = findViewById(R.id.btnTwo)
        mBtnThree = findViewById(R.id.btnThree)
        mBtnFour = findViewById(R.id.btnFour)
        mBtnFive = findViewById(R.id.btnFive)
        mBtnSix = findViewById(R.id.btnSix)
        mBtnSeven = findViewById(R.id.btnSeven)
        mBtnEight = findViewById(R.id.btnEight)
        mBtnNine = findViewById(R.id.btnNine)
        mBtnZero = findViewById(R.id.btnZero)
        mBtnPlus = findViewById(R.id.btnPlus)
        mBtnMinus = findViewById(R.id.btnMinus)
        mBtnMultiply = findViewById(R.id.btnMultiply)
        mBtnDivide = findViewById(R.id.btnDivide)
        mBtnDot = findViewById(R.id.btnDot)
        mCancel = findViewById(R.id.btnCancel)
        mBtnEqual = findViewById(R.id.btnEqual)

    }


}
