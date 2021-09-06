package com.example.megeb

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TabHost
import android.widget.TabHost.TabSpec
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

package com.example.megeb
class MainActivity : AppCompatActivity() {
    var pizzaButton: Button? = null
    var BurgerButton: Button? = null
    var placeorder: Button? = null
    var CokeButton: Button? = null
    var SpriteButton: Button? = null
    var TbHost: TabHost? = null
    var choice = " "
    var price = 0.00
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabhost = findViewById<View>(R.id.tbh) as TabHost
        CokeButton = findViewById<View>(R.id.dr1btn) as Button
        SpriteButton = findViewById<View>(R.id.dr2btn) as Button
        BurgerButton = findViewById<View>(R.id.burbtn) as Button
        pizzaButton = findViewById<View>(R.id.pizbtn) as Button
        placeorder = findViewById<View>(R.id.place) as Button
        tabhost.setup()
        var spec = tabhost.newTabSpec("Food")
        spec.setContent(R.id.Food)
        spec.setIndicator("Food")

// adding the tab to tabhost
        tabhost.addTab(spec)
        spec = tabhost.newTabSpec("Drinks")
        spec.setContent(R.id.Drink)
        spec.setIndicator("Drinks")
        tabhost.addTab(spec)
        CokeButton!!.setOnClickListener {
            choice = """
                ${choice}Coke
                
                """.trimIndent()
            price = price + 20
            val toast = Toast.makeText(applicationContext, "price = $price", Toast.LENGTH_SHORT)
            toast.show()
        }
        SpriteButton!!.setOnClickListener {
            choice = """
                ${choice}Sprite
                
                """.trimIndent()
            price = price + 20
            val toast = Toast.makeText(applicationContext, "price = $price", Toast.LENGTH_SHORT)
            toast.show()
        }
        pizzaButton!!.setOnClickListener {
            choice = """
                ${choice}Pizza
                
                """.trimIndent()
            price = price + 150
            val toast = Toast.makeText(applicationContext, "price = $price", Toast.LENGTH_SHORT)
            toast.show()
        }
        BurgerButton!!.setOnClickListener {
            choice = """
                ${choice}Burger
                
                """.trimIndent()
            price = price + 120
            val toast = Toast.makeText(applicationContext, "price = $price", Toast.LENGTH_SHORT)
            toast.show()
        }
        placeorder!!.setOnClickListener {
            val i = Intent(this@MainActivity, Checkout::class.java)
            val bundle = Bundle()
            bundle.putString("choices", choice)
            bundle.putDouble("price", price)
            i.putExtras(bundle)
            startActivity(i)
            val toast = Toast.makeText(applicationContext, "price = $price", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}