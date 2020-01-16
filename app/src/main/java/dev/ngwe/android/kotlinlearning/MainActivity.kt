package dev.ngwe.android.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a1 = Alien()
        a1.skills = "JAVA"

        var a2 = Alien()
        a2.skills = "KOTLIN"

        var a3 = Alien()
        a3.skills = a1.addMySkills(a2)
        a3.printMySkills()

        println("Hey!! ${A.show()}")

    }


}

private fun Alien.addMySkills(a2: Alien): String {
    var a4 = Alien()
    a4.skills = this.skills + " " + a2.skills
    return a4.skills
}

class Alien {

    var skills: String = "null"

    fun printMySkills() {

        println(skills)
    }


}

class A {
    companion object {
        fun show():String {
            return("You are learning Kotlin from TutorialsPoint.com")
        }
    }
}