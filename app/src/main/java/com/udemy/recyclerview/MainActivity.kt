package com.udemy.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    var countryNameList = ArrayList<String>()
    var detailList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var countriesAdapter: CountriesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("India")
        countryNameList.add("Russia")
        countryNameList.add("America")
        countryNameList.add("England")
        countryNameList.add("Austreliya")
        countryNameList.add("Japan")

        detailList.add("This is the indian flag ")
        detailList.add("This is the Russia flag ")
        detailList.add("This is the America flag ")
        detailList.add("This is the Englend flag ")
        detailList.add("This is the Australiya flag ")
        detailList.add("This is the japan flag ")

        imageList.add(R.drawable.india)
        imageList.add(R.drawable.russia)
        imageList.add(R.drawable.america)
        imageList.add(R.drawable.england)
        imageList.add(R.drawable.australia)
        imageList.add(R.drawable.japan)

        countriesAdapter = CountriesAdapter(countryNameList,detailList,imageList,this@MainActivity)

        Log.d("MainActivity"," =${countriesAdapter}")

        recyclerView.adapter = countriesAdapter
    }
}