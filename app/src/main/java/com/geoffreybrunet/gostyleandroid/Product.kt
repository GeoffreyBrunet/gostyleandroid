package com.geoffreybrunet.gostyleandroid

class Product {
    var idProduct: Long = 0
    var productName: String? = null
    var price = 0
    var picture: String? = null

    constructor() {}
    constructor(idProduct: Long, productName: String?, price: Int, picture: String?) {
        this.idProduct = idProduct
        this.productName = productName
        this.price = price
        this.picture = picture
    }
}