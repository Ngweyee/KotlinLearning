package dev.ngwe.android.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = 10000
        val d = 100.00
        val f = 100.00f
        val l: Long = 1000000004
        val s: Short = 10
        val b: Byte = 1

        println("Your Int Value is $a")
        println("Your Double  Value is $d")
        println("Your Float Value is $f")
        println("Your Long Value is $l")
        println("Your Short Value is $s")
        println("Your Byte Value is $b")

        val letter: Char    // defining a variable
        letter = 'A'        // Assigning a value to it
        println("$letter")

        val booleanValue: Boolean   // defining a variable
        booleanValue = true         // Assinging a value to it
        println("Your character value is $booleanValue")


        var rawString = "I am Raw String!"
        val escapedString = "I am escaped String!\n"

        println("Hello!  $escapedString")
        println("Hey!! $rawString ")

        val numberArray = intArrayOf(1, 2, 3, 4, 5)
        println("Hey!! I am array Example" + numberArray.filter {
            it % 2 == 0
        })

        val numbers: MutableList<Int> = mutableListOf(1, 2, 3) //mutable List
        val readOnlyView: List<Int> = numbers                  // immutable list
        println("my mutable list-- $numbers")        // prints "[1, 2, 3]"
        numbers.add(4)
        println("my mutable list after addition -- $numbers")        // prints "[1, 2, 3, 4]"
        println("readonlylist $readOnlyView")
        // readOnlyView.clear()    // ⇒ does not compile
        numbers.clear()
        print("empty list $numbers")


        val i: Int = 2
        for (j in 1..4)
            print(j) // prints "1234"

        if (i in 1..10) { // equivalent of 1 < = i && i < = 10
            println("we found your number --$i")
        }
    }
}
