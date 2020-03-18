package com.example.pazigprojkotlin.services

import com.example.pazigprojkotlin.model.Product

interface ProductManager {
    fun getProducts(): List<Product>
}

class ProductManagerImpl() : ProductManager {
    override fun getProducts(): List<Product> {
        return listOf(
            Product("makaron", 10.5),
            Product("kasza", 3.2)
        )
    }
}