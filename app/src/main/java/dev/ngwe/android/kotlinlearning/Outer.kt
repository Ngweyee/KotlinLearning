package dev.ngwe.android.kotlinlearning

class Outer {

    val innermessage = "Welcome to the innerclass's nested message TutorialsPoint.com"

    inner class Nested {
        fun foo() = innermessage
    }
}