package com.example.shopswag.services

import com.example.shopswag.model.Category
import com.example.shopswag.model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS" , "shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage") ,
        Category("SHIRTS" , "shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage")
    )

    val hats = listOf(
        Product("hat-Black","$20","hat1","In Stock"),
        Product("hat-Blue","$30","hat2","In Stock"),
        Product("hat-White","$40","hat3","In Stock"),
        Product("hat-SkyBlue","$50","hat4","Out of Stock"),
        Product("hat-Black","$20","hat1","Out of Stock"),
        Product("hat-Blue","$30","hat2","In Stock"),
        Product("hat-White","$40","hat3","In Stock"),
        Product("hat-SkyBlue","$50","hat4","In Stock"),
        Product("hat-Black","$20","hat1","Out of Stock"),
        Product("hat-Blue","$30","hat2","In Stock"),
        Product("hat-White","$40","hat3","Out of Stock"),
        Product("hat-SkyBlue","$50","hat4","In Stock")
    )
    val hoodies = listOf(
        Product("hoodie-Black","$30","hoodie1","In Stock"),
        Product("hoodie-red","$35","hoodie1","Out of Stock"),
        Product("hoodie-Gray","$45","hoodie3","In Stock"),
        Product("hoodie-DarkBlack","$55","hoodie4","In Stock"),
        Product("hoodie-Black","$30","hoodie1","Out of Stock"),
        Product("hoodie-red","$35","hoodie1","In Stock"),
        Product("hoodie-Gray","$45","hoodie3","Out of Stock"),
        Product("hoodie-DarkBlack","$55","hoodie4","In Stock"),
        Product("hoodie-Black","$30","hoodie1","In Stock"),
        Product("hoodie-red","$35","hoodie1","Out of Stock"),
        Product("hoodie-Gray","$45","hoodie3","In Stock"),
        Product("hoodie-DarkBlack","$55","hoodie4","In Stock")
    )
    val shirts = listOf(
        Product("shirt-Black","$25","shirt1","In Stock"),
        Product("shirt-Gray","$35","shirt2","In Stock"),
        Product("shirt-Red","$45","shirt3","Out of Stock"),
        Product("shirt-GryBlack","$32","shirt4","In Stock"),
        Product("shirt-DarkBlack","$29","shirt5","In Stock"),
        Product("shirt-Black","$25","shirt1","Out of Stock"),
        Product("shirt-Gray","$35","shirt2","In Stock"),
        Product("shirt-Red","$45","shirt3","In Stock"),
        Product("shirt-GryBlack","$32","shirt4","In Stock"),
        Product("shirt-DarkBlack","$29","shirt5","In Stock"),
        Product("shirt-Black","$25","shirt1","Out of Stock"),
        Product("shirt-Gray","$35","shirt2","In Stock"),
        Product("shirt-Red","$45","shirt3","Out of Stock"),
        Product("shirt-GryBlack","$32","shirt4","In Stock"),
        Product("shirt-DarkBlack","$29","shirt5","In Stock")
    )

    val digitalGroup = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HOODIES"-> hoodies
            "HATS" -> hats
            else-> digitalGroup
        }
    }
}