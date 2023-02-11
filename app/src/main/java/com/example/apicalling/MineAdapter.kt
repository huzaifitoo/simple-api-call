package com.example.apicalling

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apicalling.ProductResponseModel.ProductResponseModel
import com.example.apicalling.databinding.ProductsBinding
import com.squareup.picasso.Picasso

class MineAdapter(private var context: Context, private val mData_products: ArrayList<ProductResponseModel>):
    RecyclerView.Adapter<MineAdapter.MyViewHolder>() {
    class MyViewHolder(private val binding: ProductsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(dataProducts: ProductResponseModel){

            binding.label.text = dataProducts.title
            binding.rate.text = dataProducts.price.toString()

            Picasso.get().load(dataProducts.image).into(binding.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val productsBinding = ProductsBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(productsBinding )
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
     val dataClsItem = mData_products[position]
        holder.bind(dataClsItem)
    }

    override fun getItemCount(): Int {
     return mData_products.size
    }
}