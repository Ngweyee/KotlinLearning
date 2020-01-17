package dev.ngwe.android.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myLambda: (String) -> Unit = { s: String ->
            println(s)
        }
        val v = "TutorialsPoint.com"
        myLambda(v)
        v.myFun(myLambda)

    }

    private fun String.myFun(myLambda: (String) -> Unit) {
        print("Hey!!!")
        myLambda(this)
    }


}
