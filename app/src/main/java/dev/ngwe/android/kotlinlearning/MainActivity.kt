package dev.ngwe.android.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val obj = InterfaceImpl()
        println("My Variable Value is = ${obj.myVar}")
        print("Calling hello(): ")
        obj.Hello()
        print("Message from the Website-- ")
        println(obj.absMethod())

        val ab = multipleInterfaceExample()
        ab.printMe()
        ab.printMeToo()
    }


}

interface ExampleInterface {
    var myVar: Int // abstract property
    fun absMethod(): String// abstract method
    // fun sayHello() = "Hello there" // method with default implementation

    fun Hello() {
        println("Hello there, Welcome to TutorialsPoint.Com!")
    }

}


class InterfaceImpl : ExampleInterface {

    override var myVar: Int = 25
    override fun absMethod() = "Happy Learning "

}

interface A {

    fun printMe() {
        println(" method of interface A")
    }

}

interface B {

    fun printMeToo() {
        println("I am another Method from interface B")
    }
}


class multipleInterfaceExample : A, B

