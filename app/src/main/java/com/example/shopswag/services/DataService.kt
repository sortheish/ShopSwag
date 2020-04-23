package com.example.shopswag.services

import com.example.shopswag.model.Category
import com.example.shopswag.model.Product
import java.security.ProtectionDomain

object DataService {
    val categories = listOf(
        Category("SHIRTS" , "shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("hat-Black","$20","hat1"),
        Product("hat-Blue","$30","hat2"),
        Product("hat-White","$40","hat3"),
        Product("hat-SkyBlue","$50","hat4"),
        Product("hat-Black","$20","hat1"),
        Product("hat-Blue","$30","hat2"),
        Product("hat-White","$40","hat3"),
        Product("hat-SkyBlue","$50","hat4"),
        Product("hat-Black","$20","hat1"),
        Product("hat-Blue","$30","hat2"),
        Product("hat-White","$40","hat3"),
        Product("hat-SkyBlue","$50","hat4")
    )
    val hoodies = listOf(
        Product("hoodie-Black","$30","hoodie1"),
        Product("hoodie-red","$35","hoodie1"),
        Product("hoodie-Gray","$45","hoodie3"),
        Product("hoodie-DarkBlack","$55","hoodie4"),
        Product("hoodie-Black","$30","hoodie1"),
        Product("hoodie-red","$35","hoodie1"),
        Product("hoodie-Gray","$45","hoodie3"),
        Product("hoodie-DarkBlack","$55","hoodie4"),
        Product("hoodie-Black","$30","hoodie1"),
        Product("hoodie-red","$35","hoodie1"),
        Product("hoodie-Gray","$45","hoodie3"),
        Product("hoodie-DarkBlack","$55","hoodie4")
    )
    val shirts = listOf(
        Product("shirt-Black","$25","shirt1"),
        Product("shirt-Gray","$35","shirt2"),
        Product("shirt-Red","$45","shirt3"),
        Product("shirt-GryBlack","$32","shirt4"),
        Product("shirt-DarkBlack","$29","shirt5"),
        Product("shirt-Black","$25","shirt1"),
        Product("shirt-Gray","$35","shirt2"),
        Product("shirt-Red","$45","shirt3"),
        Product("shirt-GryBlack","$32","shirt4"),
        Product("shirt-DarkBlack","$29","shirt5"),Product("shirt-Black","$25","shirt1"),
        Product("shirt-Gray","$35","shirt2"),
        Product("shirt-Red","$45","shirt3"),
        Product("shirt-GryBlack","$32","shirt4"),
        Product("shirt-DarkBlack","$29","shirt5")
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