package com.example.shopswag.controller

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.example.shopswag.R
import com.example.shopswag.model.Product
import com.example.shopswag.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_prodcut_detail.*

class ProdcutDetailActivity : AppCompatActivity() {

    lateinit var productDetails :Product
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prodcut_detail)
        productDetails = intent.getParcelableExtra(EXTRA_PRODUCT)

        val resourceId = this.resources.getIdentifier(productDetails.image,"drawable",this.packageName)
        productDetailImage.setImageResource(resourceId)
        productDetailName.text = productDetails.title

        var stockvalue: String? = productDetails.stock
        if(stockvalue == "In Stock"){
            productDetailPrice.setTextColor(Color.GREEN)
        }else{
            productDetailPrice.setTextColor(Color.RED)
        }
        productDetailPrice.text = productDetails.price+ "   " + productDetails.stock
    }
}
