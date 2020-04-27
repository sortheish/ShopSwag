package com.example.shopswag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopswag.R
import com.example.shopswag.model.Product

class ProductAdapter(val context :Context , val products:List<Product>,val itemClick:(Product)->Unit) : RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.product_list_item,parent,false)
        return ProductHolder(view,itemClick)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
       holder.bindProduct(products[position],context)
    }

    inner class ProductHolder(itemView: View, itemClick: (Product) -> Unit): RecyclerView.ViewHolder(itemView) {
        val productImage= itemView.findViewById<ImageView>(R.id.productDetailImage)
        val productName = itemView.findViewById<TextView>(R.id.productDetailName)
        val productPrice = itemView.findViewById<TextView>(R.id.productDetailPrice)

        fun bindProduct(product: Product,context: Context){
            val resourceId = context.resources.getIdentifier(product.image,"drawable",context.packageName)
            productImage.setImageResource(resourceId)
            productName.text = product.title
            productPrice.text = product.price

            itemView.setOnClickListener {
                itemClick(product)
            }

        }

    }
}