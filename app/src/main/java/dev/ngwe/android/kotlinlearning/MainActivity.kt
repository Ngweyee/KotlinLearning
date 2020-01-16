package dev.ngwe.android.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b = BaseImpl(10)
        Derived(b).printMe()

        println("$myVar My dear friend")

        val user = User()
        user.name = "first"
        user.name = "second"


        val e= Example()
        println(e.p)


    }


}
class Example {
    var p: String by Delegate()

}


interface Base {
    fun printMe() //abstract method
}

class BaseImpl(val x: Int) : Base {
    override fun printMe() {
        println(x)
    }   //implementation of the method
}

class Derived(b: Base) : Base by b


val myVar: String by lazy {
    "Hello"
}


class User {

    var name: String by Delegates.observable("Welcome to Tutorialspoint.com") { property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}


class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}


