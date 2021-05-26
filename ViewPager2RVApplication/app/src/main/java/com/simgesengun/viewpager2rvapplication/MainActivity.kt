package com.simgesengun.viewpager2rvapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {


    private lateinit var selectedItemsList : ArrayList<Item>
    private lateinit var itemsList : ArrayList<Item>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)

        itemsList = createItemsList()
        selectedItemsList = ArrayList()

        val itemAdapter = ItemAdapter(itemsList, selectedItemsList)
        viewPager.adapter = itemAdapter
       // viewPager.setPageTransformer(DepthPageTransformer())
    }

    fun createItemsList() : ArrayList<Item>{
        return arrayListOf(
            Item(0,"Lamp",5.75,"item_00_lamp"),
            Item(1,"Wardrobe",10.20,"item_01_wardrobe"),
            Item(2,"Chest",25.50,"item_02_chest"),
            Item(3,"Musical Instrument",20.50,"item_03_musical_instrument"),
            Item(4,"Chair",10.20,"item_04_chair"),
            Item(5,"Lantern",6.75,"item_05_lantern"),
            Item(6,"Painting",50.25,"item_06_painting"),
            Item(7,"Chair",10.99,"item_07_chair"),
            Item(8,"Decor",5.99,"item_08_decor"),
        )
    }
}