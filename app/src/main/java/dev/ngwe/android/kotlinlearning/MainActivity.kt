package dev.ngwe.android.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val obj: Example = Example.OP1()
        val output = when (obj) { // defining the object of the class depending on the inuputs
            is Example.OP1 -> "Option One has been chosen"
            is Example.OP2 -> "option Two has been chosen"
            else -> "Nothing chose"
        }

        println(output)

    }


}

sealed class Example {
    class OP1 : Example()
    class OP2 : Example()
}
