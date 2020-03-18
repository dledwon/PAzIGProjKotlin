package com.example.pazigprojkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pazigprojkotlin.databinding.ActivityMainBinding
import com.example.pazigprojkotlin.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val _vm: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate view and obtain an instance of the binding class.
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        // Assign the component to a property in the binding class.
        binding.lifecycleOwner = this
        binding.viewmodel = _vm

        rvProducts.layoutManager = LinearLayoutManager(this)
        rvProducts.adapter = _vm.productAdapter
    }
}
