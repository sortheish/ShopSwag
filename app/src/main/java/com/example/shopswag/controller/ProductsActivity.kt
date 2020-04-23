package com.example.shopswag.controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.shopswag.R
import com.example.shopswag.adapter.ProductAdapter
import com.example.shopswag.services.DataService
import com.example.shopswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductAdapter(this,DataService.getProducts(categoryType))

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation== Configuration.ORIENTATION_LANDSCAPE){
            var spanCount = 3
        }
        val screen_size = resources.configuration.screenWidthDp
        if(screen_size > 720){
            spanCount = 3
        }

        val layoutManger = GridLayoutManager(this,spanCount)
        productRecyclerView.layoutManager = layoutManger
        productRecyclerView.adapter = adapter
    }
}
