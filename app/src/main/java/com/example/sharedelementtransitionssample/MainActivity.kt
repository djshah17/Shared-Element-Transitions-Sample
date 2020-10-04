package com.example.sharedelementtransitionssample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listCountries = ArrayList<Country>()
        listCountries.add(Country("USA",R.drawable.usa,"The U.S. is a country of 50 states covering a vast swath of North America, with Alaska in the northwest and Hawaii extending the nation’s presence into the Pacific Ocean. Major Atlantic Coast cities are New York, a global finance and culture center, and capital Washington, DC. Midwestern metropolis Chicago is known for influential architecture and on the west coast, Los Angeles' Hollywood is famed for filmmaking."))
        listCountries.add(Country("England",R.drawable.england,"England is a country that is part of the United Kingdom. It shares land borders with Wales to its west and Scotland to its north. The Irish Sea lies northwest of England and the Celtic Sea to the southwest. England is separated from continental Europe by the North Sea to the east and the English Channel to the south."))
        listCountries.add(Country("France",R.drawable.france,"France, in Western Europe, encompasses medieval cities, alpine villages and Mediterranean beaches. Paris, its capital, is famed for its fashion houses, classical art museums including the Louvre and monuments like the Eiffel Tower. The country is also renowned for its wines and sophisticated cuisine. Lascaux’s ancient cave drawings, Lyon’s Roman theater and the vast Palace of Versailles attest to its rich history."))
        listCountries.add(Country("Russia",R.drawable.russia,"Russia, or the Russian Federation, is a transcontinental country located in Eastern Europe and Northern Asia."))
        listCountries.add(Country("Canada",R.drawable.canada,"Canada is a country in the northern part of North America. Its ten provinces and three territories extend from the Atlantic to the Pacific and northward into the Arctic Ocean, covering 9.98 million square kilometres, making it the world's second-largest country by total area."))

        recycler_country.layoutManager = GridLayoutManager(this@MainActivity, 2)
        var countriesAdapter = CountriesAdapter(this, listCountries)
        recycler_country.adapter = countriesAdapter

    }
}
