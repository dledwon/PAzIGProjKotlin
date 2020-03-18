package com.example.pazigprojkotlin.viewmodel

import androidx.lifecycle.*
import com.example.pazigprojkotlin.model.Product
import com.example.pazigprojkotlin.services.ProductManager

class MainViewModel(private val _productManager: ProductManager) : ViewModel() {
    val testText = MutableLiveData<String>("testText")
    val productAdapter: ProductAdapter = ProductAdapter(_productManager.getProducts())
}
