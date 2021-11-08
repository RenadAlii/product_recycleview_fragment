package com.example.hw_product_recycleview

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.hw_product_recycleview.databinding.FragmentTheProductBinding


class TheProductFragment : Fragment() {

    private var _binding: FragmentTheProductBinding? = null
    private val binding get() = _binding!!


    companion object{
        const val NAME = "name"
        const val PRICE = "price"
        const val IMAGE = "image"
    }





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    //this fun just help to prepare the hold for view
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentTheProductBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        arguments?.let {
            binding.productName.text = it.getString(NAME).toString()
            binding.productImage.setImageResource(it.getString(IMAGE)!!.toInt())
            binding.productPrice.text = it.getString(PRICE)

        }

        //get element and change value
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }



}