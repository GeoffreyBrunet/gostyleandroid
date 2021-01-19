package com.geoffreybrunet.gostyleandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val productList: MutableList<Product> = ArrayList()
        productList.add(
            Product(
                1,
                "Hoodie DIABLO",
                49.49.toInt(),
                "https://cdn.shopify.com/s/files/1/1968/6751/products/product-image-699004397_2000x.jpg?v=1575933062"
            )
        )
        productList.add(
            Product(
                2,
                "T-shirt",
                27.90.toInt(),
                "https://cdn.shopify.com/s/files/1/1968/6751/products/t-shirt-rubber-t-shirt-futurxwear-noir-xl-2_2000x.jpg?v=1584427096"
            )
        )
        productList.add(
            Product(
                3,
                "Sneakers RVX 1500",
                37.00.toInt(),
                "https://cdn.shopify.com/s/files/1/1968/6751/products/product-image-916103100_2000x.jpg?v=1575933043"
            )
        )
        productList.add(
            Product(
                4,
                "Sweat pants STRIPED RÉFLÉCHISSANT 3M",
                37.90.toInt(),
                "https://cdn.shopify.com/s/files/1/1968/6751/products/jogging-striped-reflechissant-3mtm-pantalon-cargo-jogging-futurxwear_2000x.jpg?v=1584426332"
            )
        )
        productList.add(
            Product(
                5,
                "Short GALACTIC",
                46.90.toInt(),
                "https://cdn.shopify.com/s/files/1/1968/6751/products/short-galactic-short-futurxwear-noir-s_2000x.jpg?v=1593768260"
            )
        )
        productList.add(
            Product(
                6,
                "Jacket Denim Mountain",
                55.00.toInt(),
                "https://cdn.shopify.com/s/files/1/1968/6751/products/product-image-799643285_7c89fa7c-d634-4bbb-b54a-76ef44db2fc6_2000x.jpg?v=1575933076"
            )
        )
        val shopListView = findViewById<ListView>(R.id.shop_list_view)
        shopListView.adapter = ProductItemAdapter(this, productList)
    }

    fun onClickBtnPlay(view: View) {
        val intent = Intent(this, ScanActivity::class.java)
        startActivity(intent)
    }

}