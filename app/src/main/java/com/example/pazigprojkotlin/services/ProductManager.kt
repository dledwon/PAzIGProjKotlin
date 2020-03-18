package com.example.pazigprojkotlin.services

import com.example.pazigprojkotlin.model.Product

interface ProductManager {
    fun getProducts(): MutableList<Product>
}

class ProductManagerImpl() : ProductManager {
    override fun getProducts(): MutableList<Product> {
        return mutableListOf(
            Product("makaron", 10.5),
            Product("kasza", 3.2)
        )
    }
}