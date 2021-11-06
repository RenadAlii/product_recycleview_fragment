package com.example.hw_product_recycleview.data

import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.model.Product

object DataSource {
    val dataSet: List<Product> = listOf(
        Product(
            R.drawable.iphone.toString(), "Iphone 12 64GB", "4500", true, 5
        ), Product(
            R.drawable.samsung_galaxy_uitra.toString(),
            " Samsung Galaxy S21 Ultra",
            "4500",
            false,
            5
        ), Product(
            R.drawable.xiaomi_pro.toString(), "Xiaomi 11T Pro", "2000", true, 0
        ), Product(
            R.drawable.huawei_yp.toString(), " Huawei Y6p", "500", false, 0
        ), Product(
            R.drawable.samsung_galaxy_z_flip.toString(), "Samsung Galaxy Z Flip3", "5000", true, 70
        ), Product(
            R.drawable.iphone13.toString(), " Iphone 13", "6000", true, 36
        )

    )
}