package com.udemy.recyclerview

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CountriesAdapter(
    var countryNameList: ArrayList<String>,
    var detailList: ArrayList<String>,
    var imageList: ArrayList<Int>,
    var context: Context
):RecyclerView.Adapter<CountriesAdapter.CountryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view:View = LayoutInflater.from(context).inflate(R.layout.card_desig,parent,false)

        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
          holder.countryNameTextView.text = countryNameList.get(position)
        holder.countryDetailsTextView.text = detailList.get(position)
        holder.courtyFlagImage.setImageResource(imageList.get(position))
    }

    override fun getItemCount(): Int {
        Log.d("CountyAdapter","Size = ${countryNameList.size}")
        return countryNameList.size
    }

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var countryNameTextView:TextView = itemView.findViewById(R.id.txt1)
        var countryDetailsTextView:TextView = itemView.findViewById(R.id.txt2)
        var courtyFlagImage:ImageView = itemView.findViewById(R.id.img)
    }
}