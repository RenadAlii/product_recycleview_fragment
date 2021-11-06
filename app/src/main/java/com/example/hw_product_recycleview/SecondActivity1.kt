package com.example.hw_product_recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.hw_product_recycleview.data.DataSource
import com.example.hw_product_recycleview.databinding.ActivityMainBinding

class SecondActivity1 : AppCompatActivity() {
    companion object{
        const val NAME = "name"
        const val PRICE = "price"
        const val IMAGE = "image"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second1)

        val resources = this.resources
        val intent = intent


        val name = intent.getStringExtra(NAME)
        val price = intent.getStringExtra(PRICE)
        val productImage = intent.getStringExtra(IMAGE)!!.toInt()

        findViewById<TextView>(R.id.productName).text = resources.getString(R.string.product_name,name)
        findViewById<TextView>(R.id.productPrice).text = resources.getString(R.string.product_price,price)
        findViewById<ImageView>(R.id.productImage).setImageResource(productImage)



    }
}


