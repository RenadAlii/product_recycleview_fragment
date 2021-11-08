package com.example.hw_product_recycleview.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.ProductListFragmentDirections
import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.model.Product

class ProductListAdapter(
    private val context: Context, dataSet: List<Product>
) : RecyclerView.Adapter<ProductListAdapter.ItemViewHolder>() {

    //Initialize the data using the List found in data/DataSource
    private val products = dataSet

    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        val imageId: ImageView = view.findViewById(R.id.productImage)
        val starId: ImageView = view.findViewById(R.id.vipStar)
        val nameId: TextView = view.findViewById(R.id.productName)
        val priceId: TextView = view.findViewById(R.id.productPrice)
        val button: Button = view.findViewById<Button>(R.id.buy)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_product, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    @SuppressLint("StringFormatMatches")
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val product = products[position]
        holder.imageId.setImageResource(product.productImage.toInt())
        val resources = context.resources
        holder.nameId.text = resources.getString(R.string.product_name, product.productName)
        holder.priceId.text = resources.getString(R.string.product_price, product.price)
        if (product.isVip) {
            holder.starId.visibility = View.VISIBLE
        }

        holder.button.setOnClickListener {

            //check if quantityNumber of the product is > 0 then go to another activity
            //else show Toast
            if (product.quantityNumber > 0) {
                val action = ProductListFragmentDirections.
                actionProductListFragmentToTheProductFragment (
                    name = product.productName
                    , price = product.price
                    , image = product.productImage)


                //perform navigation action
                holder.view.findNavController().navigate(action)

            } else {
                Toast.makeText(
                    context,
                    context.getString(R.string.notavailable),
                    Toast.LENGTH_SHORT
                ).show()

            }
        }



    }

    override fun getItemCount(): Int = products.size
}