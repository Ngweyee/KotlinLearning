package dev.ngwe.android.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = internalExample()
        println(a.doSomething())
    }


}


open class A() {
    protected val i = 1
}

class B : A() {
    fun getValue(): Int {
        return i
    }

}

class internalExample {
    internal val i = 1
    internal fun doSomething() {
        println(i)
    }
}

class publicExample {
    val i = 1
    fun doSomething() {
    }
}
