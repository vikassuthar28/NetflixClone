package com.example.movieappdesigndemo.adpter

import android.content.Context
import android.icu.text.CaseMap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movieappdesigndemo.R
import com.example.movieappdesigndemo.model.AllCategory
import com.example.movieappdesigndemo.model.CategoryItem

class MainRecyclerAdapter(
    private val context: Context,
    private val allCategory: List<AllCategory>
) :
    RecyclerView.Adapter<MainRecyclerAdapter.MainRecyclerViewHolder>() {

    class MainRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var categotyTitle: TextView
        var itemRecycler: RecyclerView

        init {
            categotyTitle = itemView.findViewById(R.id.cat_title)
            itemRecycler = itemView.findViewById(R.id.cat_iteam_recycler)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecyclerViewHolder {
        return MainRecyclerViewHolder(
            LayoutInflater.from(context).inflate(R.layout.main_recycler_row_item, parent, false)
        )

    }

    override fun onBindViewHolder(holder: MainRecyclerViewHolder, position: Int) {


        holder.categotyTitle.text = allCategory[position].categoryTitle
        setCategoryRecycelr(holder.itemRecycler,allCategory[position].categoryItem)
    }

    private fun setCategoryRecycelr(recyclerView: RecyclerView,categoryItem: List<CategoryItem>){

        val itemRecyclerAdapter = CategoryItemAdapter(context, categoryItem)
        recyclerView.layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        recyclerView.adapter = itemRecyclerAdapter
    }


    override fun getItemCount(): Int {
        return allCategory.size
    }

}