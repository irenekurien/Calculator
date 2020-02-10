package com.example.calculator

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var isOpp: Boolean = false
    private var secondNumberIndex: Int = 0
    private var n1:Double = 0.0
    private var n2:Double = 0.0
    private var opp : String = ""
    private var content: String = ""
    private var secondNo: String = ""
    private var print  : String =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zero: Button = findViewById<Button>(R.id.btn0)
        val one: Button = findViewById<Button>(R.id.btn1)
        val two: Button = findViewById<Button>(R.id.btn2)
        val three: Button = findViewById<Button>(R.id.btn3)
        val four: Button = findViewById<Button>(R.id.btn4)
        val five: Button = findViewById<Button>(R.id.btn5)
        val six: Button = findViewById<Button>(R.id.btn6)
        val seven: Button = findViewById<Button>(R.id.btn7)
        val eight: Button = findViewById<Button>(R.id.btn8)
        val nine: Button = findViewById<Button>(R.id.btn9)
        val add: Button = findViewById<Button>(R.id.btnAdd)
        val sub: Button = findViewById<Button>(R.id.btnSub)
        val mul: Button = findViewById<Button>(R.id.btnMul)
        val root: Button = findViewById<Button>(R.id.btnRoot)
        val equal: Button = findViewById<Button>(R.id.btnEquals)
        val dot: Button = findViewById<Button>(R.id.btnDot)
        val clear: Button = findViewById<Button>(R.id.btnClear)
        val div: ImageButton = findViewById<ImageButton>(R.id.btnDiv)
        val power: ImageButton = findViewById<ImageButton>(R.id.btnPow)
        val backspace: ImageButton = findViewById<ImageButton>(R.id.btnBackspace)
        val result: TextView = findViewById<TextView>(R.id.Result)
        val control: TextView = findViewById<TextView>(R.id.Control)

fun isClick(opp:String):Double
{
    var len:Int = 0
    when(opp){
        "+" -> {
            content = control.text.toString()
            secondNo = content.substring(secondNumberIndex, content.length)
            n2 = secondNo.toDouble()
            n1 += n2
            print = n1.toString()
            control.setText(print)
        }

        "-" -> {
            content = control.text.toString()
            secondNo = content.substring(secondNumberIndex, content.length)
            n2 = secondNo.toDouble()
            n1 -= n2
            print = n1.toString()
            control.setText(print)
        }

        "*" -> {
            content = control.text.toString()
            secondNo = content.substring(secondNumberIndex, content.length)
            n2 = secondNo.toDouble()
            n1 *= n2
            print = n1.toString()
            control.setText(print)
        }

        "/" -> {
            content = control.text.toString()
            secondNo = content.substring(secondNumberIndex, content.length)
            n2 = secondNo.toDouble()
            n1 /= n2
            print = n1.toString()
            control.setText(print)
        }

        "." -> {
            content = control.text.toString()
            secondNo = n1.toInt().toString() + "." + content.substring(
                secondNumberIndex,
                content.length
            )
            Log.e("blah blah",n1.toString())
            n1 = secondNo.toDouble()
            print = n1.toString()
            control.setText(print)
        }

        "^" -> {
            content = control.text.toString()
            secondNo = content.substring(secondNumberIndex, content.length)
            n2 = secondNo.toDouble()
            n1 = Math.pow(n1, n2)
            print = n1.toString()
            control.setText(print)
        }
    }
    return n1
}
            val calculatorListener = View.OnClickListener { v ->
                val id = v.id
                when (id) {

                    R.id.btn0 -> {
                        control.append('0'.toString())
                        result.text = ""
                    }

                    R.id.btn1 -> {
                        control.append('1'.toString())
                        result.text = ""
                    }

                    R.id.btn2 -> {
                        control.append('2'.toString())
                        result.text = ""
                    }

                    R.id.btn3 -> {
                        control.append('3'.toString())
                        result.text = ""
                    }

                    R.id.btn4 -> {
                        control.append('4'.toString())
                        result.text = ""
                    }
                    R.id.btn5 -> {
                        control.append('5'.toString())
                        result.text = ""
                    }

                    R.id.btn6 -> {
                        control.append('6'.toString())
                        result.text = ""
                    }

                    R.id.btn7 -> {
                        control.append('7'.toString())
                        result.text = ""
                    }

                    R.id.btn8 -> {
                        control.append('8'.toString())
                        result.text = ""
                    }

                    R.id.btn9 -> {
                        control.append('9'.toString())
                        result.text = ""
                    }

                    R.id.btnAdd -> {

                        if(isOpp)
                        {
                            n1 = isClick(opp)
                            isOpp= false
                        }

                        var content: String = control.text.toString()
                        secondNumberIndex = content.length + 1
                        n1 = content.toDouble()
                        control.append('+'.toString())
                        isOpp = true
                        opp = "+"
                        result.text = ""
                    }

                    R.id.btnSub -> {
                        if (isOpp)
                        {
                            n1 = isClick(opp)
                            isOpp= false
                        }
                        var content: String = control.text.toString()
                        secondNumberIndex = content.length + 1
                        n1 = content.toDouble()
                        control.append('-'.toString())
                        isOpp = true
                        opp = "-"
                        result.text = ""

                    }

                    R.id.btnMul -> {
                        if(isOpp)
                        {
                            n1 = isClick(opp)
                            isOpp= false
                        }
                        var content: String = control.text.toString()
                        secondNumberIndex = content.length + 1
                        n1 = content.toDouble()
                        control.append('*'.toString())
                        isOpp = true
                        opp = "*"
                        result.text = ""
                    }

                    R.id.btnDiv -> {
                        if(isOpp)
                        {
                            n1 = isClick(opp)
                            isOpp= false
                        }
                        var content: String = control.text.toString()
                        secondNumberIndex = content.length + 1
                        n1 = content.toDouble()
                        control.append('/'.toString())
                        isOpp = true
                        opp = "/"
                        result.text = ""

                    }

                    R.id.btnDot -> {
                        if (isOpp)
                        {
                            n1 = isClick(opp)
                            isOpp= false
                        }
                        var content: String = control.text.toString()
                        secondNumberIndex = content.length + 1
                        n1 = content.toDouble()
                        control.append('.'.toString())
                        isOpp = true
                        opp = "."
                        result.text = ""
                    }

                    R.id.btnPow -> {

                        if(isOpp)
                        {
                            n1 = isClick(opp)
                            isOpp = false
                        }
                        var content: String = control.text.toString()
                        secondNumberIndex = content.length + 1
                        n1 = content.toDouble()
                        control.append('^'.toString())
                        isOpp = true
                        opp = "^"
                        result.text = ""

                    }

                    R.id.btnRoot -> {
                        var content: String = control.text.toString()
                        secondNumberIndex = content.length + 1
                        n1 = content.toDouble()
                        control.append("^(1/2)")
                        result.text = ""
                        n1 = Math.sqrt(n1)
                        print = n1.toString()
                        control.setText(print)
                    }

                    R.id.btnClear -> {
                        result.text = ""
                        control.text = ""
                        n1 = 0.0
                        n2 = 0.0
                    }

                    R.id.btnBackspace -> {
                        if (control.text.toString().isNotEmpty())
                            control.text =
                                control.text.toString()
                                    .substring(0, control.text.toString().length - 1)
                        result.text = ""
                    }

                    R.id.btnEquals -> {
                        if(isOpp)
                        {
                            n1 = isClick(opp)
                            isOpp = false
                        }
                        var print: String = ""
                        print = n1.toString()
                        result.setText(print)
                    }
                }
            }

            zero.setOnClickListener(calculatorListener)
            one.setOnClickListener(calculatorListener)
            two.setOnClickListener(calculatorListener)
            three.setOnClickListener(calculatorListener)
            four.setOnClickListener(calculatorListener)
            five.setOnClickListener(calculatorListener)
            six.setOnClickListener(calculatorListener)
            seven.setOnClickListener(calculatorListener)
            eight.setOnClickListener(calculatorListener)
            nine.setOnClickListener(calculatorListener)

            add.setOnClickListener(calculatorListener)
            sub.setOnClickListener(calculatorListener)
            mul.setOnClickListener(calculatorListener)
            div.setOnClickListener(calculatorListener)
            root.setOnClickListener(calculatorListener)
            power.setOnClickListener(calculatorListener)
            dot.setOnClickListener(calculatorListener)

            clear.setOnClickListener(calculatorListener)
            backspace.setOnClickListener(calculatorListener)
            equal.setOnClickListener(calculatorListener)
        }
}