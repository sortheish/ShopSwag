package com.example.shopswag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.shopswag.R
import com.example.shopswag.model.Category
import com.example.shopswag.services.DataService
import kotlinx.android.synthetic.main.categoary_list_item.view.*

class CatergoryRecyclerAdapter(val context: Context, val catergories: List<Category>) :
    RecyclerView.Adapter<CatergoryRecyclerAdapter.RecycleHolder>() {

    /**
     * This function is call by recyclerview to display a data at specific location
     * Binding is process of prepare child view to display a data according to position within the adapter
     *
     * This called very first time or view not created
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.categoary_list_item,parent,false)
        return RecycleHolder(view)
    }

    /**
     * Telling recyclerview how many item is going to display
     */
    override fun getItemCount(): Int {
      return catergories.count()
    }

    /**
     * This method is calll when the new holders are needed
     */
    override fun onBindViewHolder(holder: RecycleHolder, position: Int) {
        holder.bindCatergory(context,catergories[position])
    }

    /**
     * This class hold the references of UI element in recyclerview/list
     * Prepared the data child view to display a data according to position within the adapter
     */
    inner class RecycleHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val catergoryImage: ImageView = itemView.findViewById(R.id.catergoryView)
        val catergoryName :TextView = itemView.findViewById(R.id.catergory_name)

        fun bindCatergory(context: Context , catergory: Category){
            val resourceId = context.resources.getIdentifier(catergory.image,"drawable",context.packageName)
            catergoryImage.setImageResource(resourceId)
            catergoryName.text = catergory.title

        }
    }
}