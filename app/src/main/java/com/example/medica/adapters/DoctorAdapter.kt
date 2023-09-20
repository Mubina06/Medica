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

        var photo: ImageView = itemView.findViewById(R.id.img)
        var namee: TextView = itemView.findViewById(R.id.named)
        var tyhos: TextView = itemView.findViewById(R.id.tyhos)
        var review: TextView = itemView.findViewById(R.id.review)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorAdapter.MyHolder {
        var itemView = MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.doctors_item, parent, false))
        return itemView
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var item = listdoctor[position]
        holder.photo.setImageResource(item.photo)
        holder.namee.text = item.name
        holder.tyhos.text = item.type
        holder.review.text = item.reviews


        holder.itemView.setOnClickListener{
            onItemClick?.invoke(item)
        }
    }



    override fun getItemCount(): Int {
        return listdoctor.size
    }

}