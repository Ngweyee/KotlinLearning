package dev.ngwe.android.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bcd = BCD()
        bcd.think()
    }


}

open class ABC {
    open fun think() {
        println("Hey!! I am thinking")
    }
}

class BCD : ABC() {

    override fun think() {
        println("I am thinking from child class")
    }
}