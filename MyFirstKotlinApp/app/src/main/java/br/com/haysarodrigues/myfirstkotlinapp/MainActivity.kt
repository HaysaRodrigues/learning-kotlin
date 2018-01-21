package br.com.haysarodrigues.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    var x = 7 //var int
    var y : String = "My String" // another way yo create a string
    var z : Unit = Unit // when something doesn't return anything, it returns Unit. There ins't void in Kotlin.


    var foo: Int = 20 // foo is an int variable
    var bar: Long = foo.toLong() // to insert foo into bar, it's necessary to do a explicit cast


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** This TOAST come from an library called anko */
        button1.setOnClickListener{
            toast("Hello, ${userName.text}")
            toast("Y is: ${x}")
            
        }
    }
}
