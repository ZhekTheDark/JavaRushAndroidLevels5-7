package com.example.javarushandroidlevels5_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        value_of_quantity_text_view.text = "$i"

    }

    /**
     * This method is called when the order button is clicked.
     */
    fun submitOrder(view: View) {
        display(++i)
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private fun display(number: Int) {
        value_of_quantity_text_view.text = "$number"
    }
}