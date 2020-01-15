package dev.ngwe.android.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val obj = MyClass()
        obj.printMe()

        val nest = Outer().Nested().foo()
        println(nest)

        // inner class


        // Anonymous inner class
        var programmer: Human = object : Human {
            override fun think() {
                println("I am an example of Anonymous Inner Class ")
            }
        }

        programmer.think()


    }


    interface Human {
        fun think()
    }
}