package dev.ngwe.android.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // if....else
        val a = 5
        val b = 2
        var max: Int

        max = if (a > b) a else b
        println("Maximum of a or b is $max")

        // Use of When
        val x = 5
        when (x) {
            1 -> println("x == 1")
            2, 5 -> println("x is $x")
            else -> {
                println("x is neither 1 nor 2")
            }
        }

        val items = listOf(1, 2, 3, 4)
        for (i in items) println("values of the array" + i)

        for ((index, value) in items.withIndex()) {
            println("The printed value $value at index $index")
        }

        // while loop
        var w: Int = 0
        println("Example of While Loop--")

        while (w <= 10) {
            println(w)
            w++
        }

        //do while loop
        var dw = 0
        do {
            dw = dw + 10
            println("I am inside Do block---$dw")
        } while (dw <= 50)


//return , break, continue, customLabel
        myLabel@ for (rbc in 1..10) { // appling the custom label
            if (rbc == 5) {
                println("I am inside if block with value$rbc\n-- hence it will close the operation")
                break@myLabel //specifing the label
            } else {
                println("I am inside else block with value$rbc")
                continue@myLabel
            }
        }
    }
}