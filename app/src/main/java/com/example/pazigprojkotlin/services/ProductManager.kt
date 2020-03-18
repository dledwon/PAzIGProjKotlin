package com.example.pazigprojkotlin.services

import com.example.pazigprojkotlin.model.Product

interface ProductManager {
    fun getProducts(): MutableList<Product>
    fun addProduct(product: Product)
}

class ProductManagerImpl() : ProductManager {
    private val _products : MutableList<Product> = mutableListOf(
        Product("makaron", 10.5),
        Product("kasza", 3.2)
    )

    override fun getProducts(): MutableList<Product> {
        return _products.toMutableList()
    }

    override fun addProduct(product: Product) {
         _products.add(product)
    }
}