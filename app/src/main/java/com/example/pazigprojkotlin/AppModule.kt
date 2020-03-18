package com.example.pazigprojkotlin

import com.example.pazigprojkotlin.services.ProductManager
import com.example.pazigprojkotlin.services.ProductManagerImpl
import com.example.pazigprojkotlin.viewmodel.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

@JvmField
val appModule = module {
    // single instance of HelloRepository
    single<ProductManager> { ProductManagerImpl() }

    // MyViewModel ViewModel
    viewModel { MainViewModel(get()) }
}