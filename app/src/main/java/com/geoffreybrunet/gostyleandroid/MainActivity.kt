package com.geoffreybrunet.gostyleandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickBtnPlay(view:View) {
        val intent = Intent(this, ProductsActivity::class.java)
        startActivity(intent)
    }
}