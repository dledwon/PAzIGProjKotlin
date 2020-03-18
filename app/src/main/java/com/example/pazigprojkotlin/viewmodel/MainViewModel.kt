package com.example.pazigprojkotlin.viewmodel

import androidx.lifecycle.*
import com.example.pazigprojkotlin.model.Product
import com.example.pazigprojkotlin.services.ProductManager

class MainViewModel(private val _productManager: ProductManager) : ViewModel() {
    val testText = MutableLiveData<String>("testText")

    private val _products = MutableLiveData<List<Product>>(_productManager.getProducts())
    val products: LiveData<List<Product>>
        get() = _products
}
