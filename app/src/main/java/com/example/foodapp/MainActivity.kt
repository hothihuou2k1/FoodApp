package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var arraymonan: ArrayList<MonAn> = ArrayList()
        arraymonan.add(MonAn("Bánh tráng trộn", R.drawable.banhtrang))
        arraymonan.add(MonAn("Toboky", R.drawable.toboki))
        arraymonan.add(MonAn("Chân gà sả ớt", R.drawable.châng))
        arraymonan.add(MonAn("Sữa chua", R.drawable.suachua))
        arraymonan.add(MonAn("Xoài lắc", R.drawable.xoailac))
        arraymonan.add(MonAn("Thạch dừa", R.drawable.thachdua))


        listview.adapter = CustomAdapter (this@MainActivity,arraymonan)
    }
}