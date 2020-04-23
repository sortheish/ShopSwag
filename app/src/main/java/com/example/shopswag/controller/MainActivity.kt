package com.example.shopswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shopswag.R
import com.example.shopswag.adapter.CatergoryAdapter
import com.example.shopswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var categoryAdapter : CatergoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryListView.adapter = CatergoryAdapter(this,DataService.categories)
    }
}
