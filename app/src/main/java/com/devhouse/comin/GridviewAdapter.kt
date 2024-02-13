package com.devhouse.comin

import android.annotation.SuppressLint
import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class GridviewAdapter(val context: Context, val img_list : Array<Int>, val text_list : Array<String>) : BaseAdapter(){
    override fun getCount(): Int {
        return img_list.size
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view : View = LayoutInflater.from(context).inflate(R.layout.gridview_item, null)
        val gridView: TextView = view.findViewById(R.id.gridview)
        return view
    }
}