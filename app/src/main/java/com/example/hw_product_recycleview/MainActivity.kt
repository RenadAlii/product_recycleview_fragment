package com.example.hw_product_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.adapter.ProductListAdapter
import com.example.hw_product_recycleview.databinding.ActivityMainBinding
import com.example.hw_product_recycleview.data.DataSource

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = DataSource.dataSet
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ProductListAdapter(this, myDataset)


    }
}