package dev.ngwe.android.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var objet = genericExample("JAVA")
        var objet1 = genericExample(10)

        var object2 = genericExample<Int>(10)
        var object3 = genericExample<Double>(10.00)
        println(object2)
        println(object3)
    }


}

class genericExample<T>(input: T) {

    init {
        println("I am getting called with the value $input")

    }


}

