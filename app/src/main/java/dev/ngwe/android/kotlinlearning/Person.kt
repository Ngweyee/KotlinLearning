package dev.ngwe.android.kotlinlearning

class Person(val firstName: String, var age: Int) {
    //class body

}

class HUman(val firstName: String, var age: Int) {
    val message: String = "Hey!!!"

    constructor(name: String, age: Int, message: String) : this(name, age) {
    }
}