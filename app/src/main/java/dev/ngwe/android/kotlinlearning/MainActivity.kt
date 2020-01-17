package dev.ngwe.android.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s = Student("TutorialsPoint.com", "Kotlin")
        val (name, subject) = s
        println("You are learning $subject from $name")
    }


}

data class Student(val a: String, val b: String) {
    var name: String = a
    var subject: String = b
}
