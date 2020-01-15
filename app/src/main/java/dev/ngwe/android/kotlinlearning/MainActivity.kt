package dev.ngwe.android.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person1 = Person("ngwe yee shoon", 25)
        println("First Name = ${person1.firstName}")
        println("Age = ${person1.age}")

        // secondary constructor
        val HUman = HUman("TutorialsPoint.com", 25)
        println(
            HUman.message + HUman.firstName +
                    "Welcome to the example of Secondary  constructor, Your Age is-${HUman.age}"
        )
    }


}