package com.example.sharedelementtransitionssample

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        setSupportActionBar(toolbar_details)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        if(intent.hasExtra("country")){
            val getCountry = intent.getSerializableExtra("country") as Country
            img_country_details.setImageResource(getCountry.image)
            txt_title_details.text = getCountry.name
            txt_country_desc_details.text = getCountry.desc
        }

    }

}