package com.example.sharedelementtransitionssample

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import androidx.recyclerview.widget.RecyclerView


class CountriesAdapter (private val context: Context, private var listCountries: MutableList<Country>) : RecyclerView.Adapter<CountriesAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.country_row,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCountries.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val getCountry = listCountries[position]
        holder.imageCountry?.setImageResource(getCountry.image)
        holder.nameCountry?.text = getCountry.name

        holder.cardCountry?.setOnClickListener {
            val detailsIntent = Intent(context, DetailsActivity::class.java)
            detailsIntent.putExtra("country",getCountry)
            val pair1: androidx.core.util.Pair<View,String> = androidx.core.util.Pair(holder.imageCountry as View,context.resources.getString(R.string.img_transition))
            val pair2: androidx.core.util.Pair<View,String> = Pair(holder.nameCountry as View,context.resources.getString(R.string.title_transition))
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(context as Activity, pair1, pair2)
            ActivityCompat.startActivity(context,detailsIntent,options.toBundle())
        }
    }

    class MyViewHolder(var view: View) : RecyclerView.ViewHolder(view){

        var cardCountry: CardView? = null
        var imageCountry: ImageView? = null
        var nameCountry: TextView? = null

        init {
            cardCountry = view.findViewById(R.id.card_country_row)
            imageCountry = view.findViewById(R.id.img_country_row)
            nameCountry = view.findViewById(R.id.txt_country_row)
        }

    }

}