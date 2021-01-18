package com.geoffreybrunet.gostyleandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
    }

    fun onClickBtnPlay(view: View) {
        val intent = Intent(this, ScanActivity::class.java)
        startActivity(intent)
    }
}