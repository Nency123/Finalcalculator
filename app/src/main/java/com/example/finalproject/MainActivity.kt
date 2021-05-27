package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.ArithmeticException


class MainActivity : AppCompatActivity() {
    lateinit var output: TextView
             var LastNumber : Boolean = false
             var Error : Boolean = false
             var Dot : Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        output = findViewById(R.id.etShowNumber)


    }

    fun onDigit (view: View)
    {
        if(Error)
        {
            output.text = (view as Button).text
            Error=false
        }
        else
        {
            output.append((view as Button).text)
        }
        LastNumber=true
    }


    fun onDecimalpoint (view: View)
    {
        if(LastNumber && !Error && !Dot )
        {
            output.append(".")
            LastNumber=false
            Dot=true
        }
    }

    fun onOperator(view: View)
    {
        if(LastNumber && !Error)
        {
            output.append((view as Button).text)
            LastNumber=false
            Dot=false
        }
    }

    fun onClear(view: View)
    {
        this.output.text = " "
        LastNumber=false
        Error=false
        Dot=false
    }

    fun onEqual(view: View)
    {
        if(LastNumber && ! Error)
        {
            val txt = output.text.toString()
            val expression=ExpressionBuilder(txt).build()
            try {
                val result = expression.evaluate()
                output.text = result.toString()
                Dot=true
            }
            catch (e:ArithmeticException)
            {
                output.text = "ERROR"
                Error = true
                LastNumber = false
            }
        }
    }



}




