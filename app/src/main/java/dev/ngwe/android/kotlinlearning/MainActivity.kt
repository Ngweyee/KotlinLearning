package dev.ngwe.android.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val book = Book("Kotlin", "TutorialPoint.com", 5)
        println("Name of the Book is--" + book.name) // "Kotlin"
        println("Publisher Name--" + book.publisher) // "TutorialPoint.com"
        println("Review of the book is--" + book.reviewScore) // 5
        book.reviewScore = 7
        println("Printing all the info all together--$book")
        //using inbuilt function of the data class

        println("Example of the hashCode function--" + book.hashCode())
    }


}

data class Book(val name: String, val publisher: String, var reviewScore: Int)


