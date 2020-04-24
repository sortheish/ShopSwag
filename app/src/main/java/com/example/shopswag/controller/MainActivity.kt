package com.example.shopswag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.size
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopswag.R
import com.example.shopswag.adapter.CatergoryAdapter
import com.example.shopswag.adapter.CatergoryRecyclerAdapter
import com.example.shopswag.services.DataService
import com.example.shopswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var categoryAdapter : CatergoryRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryAdapter = CatergoryRecyclerAdapter(this,DataService.categories){categoryClick ->
            val productIntent = Intent(this,ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,categoryClick.title)
            startActivity(productIntent)
        }
        categoryListView.adapter = categoryAdapter

        val layoutManger = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManger
        categoryListView.setHasFixedSize(true)

    }
}
