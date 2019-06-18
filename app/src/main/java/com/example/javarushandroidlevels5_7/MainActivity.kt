package com.example.javarushandroidlevels5_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

//import android.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //val valueOfCoffees = value_of_quantity_text_view.text
    //var numberOfCoffees = valueOfCoffees.toString().toInt()
    var numberOfCoffees = 1

    fun increment(view: View) {
        numberOfCoffees++
        display(numberOfCoffees)
    }

    fun decrement(view: View) {
        numberOfCoffees--
        display(numberOfCoffees)
    }

    /**
     * This method is called when the order button is clicked.
     */
    fun submitOrder(view: View) {
        display(numberOfCoffees)
        displayPrice(numberOfCoffees * 5)
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private fun display(number: Int) {
        value_of_quantity_text_view.text = "$number"
    }

    /**
     * This method displays the given price on the screen.
     */
    private fun displayPrice(number: Int) {
        value_of_price_text_view.text = "Total: $$number\nThank you!"
    }

}