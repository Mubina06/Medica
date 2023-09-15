package com.example.medica.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.medica.R
import com.example.medica.ui.ButtonItem
import com.example.medica.ui.DoctorItem
import com.example.medica.ui.HomeFragment

class DoctorAdapter(val listdoctor: MutableList<DoctorItem>, homeFragment: HomeFragment): RecyclerView.Adapter<DoctorAdapter.MyHolder>() {

    var onItemClick : ((DoctorItem) -> Unit)? = null
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


        var photo = itemView.findViewById<ImageView>(R.id.img)
        var namee = itemView.findViewById<TextView>(R.id.named)
        var tyhos = itemView.findViewById<TextView>(R.id.tyhos)
        var review = itemView.findViewById<TextView>(R.id.review)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorAdapter.MyHolder {
        var itemView = MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.doctors_item, parent, false))
        return itemView
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var item = listdoctor.get(position)
        holder.photo.setImageResource(item.photo)
        holder.namee.setText(item.name)
        holder.tyhos.setText(item.type)
        holder.review.setText(item.reviews)


        holder.itemView.setOnClickListener{
            onItemClick?.invoke(item)
        }
    }



    override fun getItemCount(): Int {
        return listdoctor.size
    }

}