package com.example.shopswag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.shopswag.R
import com.example.shopswag.model.Category

class CatergoryAdapter(context : Context,categories : List<Category> ): BaseAdapter(){
    private val context = context
    private val categories = categories

    override fun getView(position: Int, convertview: View?, parent: ViewGroup?): View {
        val categoryView :View
        val holder : ViewHolder
        if(convertview == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.categoary_list_item , null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.catergoryView)
            holder.catergoryName= categoryView.findViewById(R.id.catergory_name)

            categoryView.tag = holder
        }else{
            holder = convertview.tag as ViewHolder
            categoryView = convertview
        }
        val resourceId = context.resources.getIdentifier(categories[position].image,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.catergoryName?.text  = categories[position].title
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder{
        var categoryImage: ImageView? = null
        var catergoryName:TextView? = null

    }
}