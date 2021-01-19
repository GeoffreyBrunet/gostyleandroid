package com.geoffreybrunet.gostyleandroid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

internal class ProductItemAdapter(//field
    private val context: Context, private val highTechItemList: List<Product>
) : BaseAdapter() {
    private val inflater: LayoutInflater
    override fun getCount(): Int {
        return highTechItemList.size
    }

    override fun getItem(position: Int): Product {
        return highTechItemList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(i: Int, view: View?, viewGroup: ViewGroup): View {
        var view = view
        view = inflater.inflate(R.layout.adapter_item, viewGroup, false)

        //get information about item
        val currentItem = getItem(i)
        val productName = currentItem.productName
        val productImage = currentItem.picture
        val productPrice = currentItem.price.toDouble()

        //get item icon view
        val itemIconView = view.findViewById<ImageView>(R.id.item_icon)

        //Picture get on WEB
        Picasso.get().load(productImage).resize(70, 100).into(itemIconView)

        //get item name view
        val itemNameView = view.findViewById<TextView>(R.id.item_name)
        itemNameView.text = productName

        //get item price view
        val itemPriceView = view.findViewById<TextView>(R.id.item_price)
        itemPriceView.text = productPrice.toString() + "€"
        view.setOnClickListener {
            Toast.makeText(
                context,
                "Vous essayez d'acheter un/une " + productName + ",  pour le prix de " + productPrice + "€",
                Toast.LENGTH_SHORT
            ).show()
        }
        return view
    }

    //Constructor
    init {
        inflater = LayoutInflater.from(context)
    }
}