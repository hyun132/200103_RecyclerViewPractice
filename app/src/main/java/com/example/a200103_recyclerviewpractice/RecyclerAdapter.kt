package com.example.a200103_recyclerviewpractice

import android.content.Context
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.a200103_recyclerviewpractice.datas.myitem

class RecyclerAdapter(
    val context: Context,
    val items: ArrayList<myitem>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    val mContext = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val inflatedView = parent.inflate(R.layout.recyclerview_item_row,false)
        return ViewHolder(inflatedView)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val rowItem = items[position]

        holder.itemNameTxt.text = rowItem.name
        holder.itemPriceTxt.text = rowItem.price.toString()

        val view = holder.itemView
        view.setOnClickListener {
            Toast.makeText(view.context,"${position}",Toast.LENGTH_SHORT).show()
        }

    }

    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{

        var itemNameTxt = itemView.findViewById<TextView>(R.id.nameTxt)
        var itemPriceTxt = itemView.findViewById<TextView>(R.id.priceTxt)
        override fun onClick(v: View?) {
//            Toast.makeText(v?.context,"${adapterPosition}",Toast.LENGTH_SHORT).show()
        }


    }
}

