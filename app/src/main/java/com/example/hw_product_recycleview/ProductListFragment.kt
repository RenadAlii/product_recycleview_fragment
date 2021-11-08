package com.example.hw_product_recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_product_recycleview.adapter.ProductListAdapter
import com.example.hw_product_recycleview.data.DataSource
import com.example.hw_product_recycleview.databinding.FragmentProductListBinding


class ProductListFragment : Fragment() {

    private var _binding: FragmentProductListBinding? = null


    private val binding get() = _binding!!


    private val myDataset = DataSource.dataSet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentProductListBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.recyclerView.adapter = ProductListAdapter(requireContext(), myDataset)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}