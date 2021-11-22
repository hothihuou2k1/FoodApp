package com.example.foodapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextClock
import android.widget.TextView

class CustomAdapter constructor( var context : Context, var mangmonan : ArrayList<MonAn>) : BaseAdapter (){
   class ViewHolder(row: View){
        var tenoman: TextView
        var imagemonan : ImageView

        init {
            tenoman=  row.findViewById(R.id.tenmonan) as TextView
            imagemonan = row.findViewById(R.id.imagemonan) as ImageView
        }
   }
    override fun getView(position: Int, convertview: View?, p2: ViewGroup?): View? {
            var view : View?
            var viewholder : ViewHolder
            if(convertview == null){
                var layoutInflater:LayoutInflater = LayoutInflater.from(context)
                view = layoutInflater.inflate(R.layout.dong_monan,null)
                viewholder = ViewHolder(view)
                view.tag = viewholder
            }
        else{
            view =convertview
                viewholder = convertview.tag as ViewHolder
            }
        var monan:MonAn = getItem(position) as MonAn
        viewholder.tenoman.text =monan.ten
        viewholder.imagemonan.setImageResource(monan.hinhanh)
        return view as View
    }

    override fun getItem(posotion: Int): Any {
        return mangmonan.get(posotion)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
       return mangmonan.size
    }





}