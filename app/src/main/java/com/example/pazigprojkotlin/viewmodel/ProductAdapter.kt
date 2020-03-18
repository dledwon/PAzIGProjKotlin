package com.example.pazigprojkotlin.viewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pazigprojkotlin.model.Product
import androidx.recyclerview.widget.RecyclerView;
import com.example.pazigprojkotlin.R
import kotlinx.android.synthetic.main.listitem_product.view.*

class ProductAdapter(
    private var _products: MutableList<Product> = mutableListOf<Product>()) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    fun addItem(product: Product)
    {
        _products.add(product)
        notifyDataSetChanged()
    }

    fun setData(products: MutableList<Product>) {
        _products = products
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(
            inflater.inflate(
                R.layout.listitem_product,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return _products.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(_products[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(product: Product){
            itemView.txtName.text = product.name
            itemView.txtPrice.text = product.price.toString()
        }
    }
}