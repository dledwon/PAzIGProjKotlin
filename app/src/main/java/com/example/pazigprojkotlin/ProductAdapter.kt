package com.example.pazigprojkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pazigprojkotlin.model.Product
import androidx.recyclerview.widget.RecyclerView;

private class ProductAdapter(private val items: List<Product>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    internal class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    }
}