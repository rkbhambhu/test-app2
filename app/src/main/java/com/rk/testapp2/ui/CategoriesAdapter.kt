package com.rk.testapp2.ui

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rk.testapp2.model.Category

class CategoriesAdapter : RecyclerView.Adapter<CategoriesAdapter.MyViewHolder>() {

    val list = ArrayList<Category>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        //val txtId = itemView.findViewById<>(R.)
    }
}
