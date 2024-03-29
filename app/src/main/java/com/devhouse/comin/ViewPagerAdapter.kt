package com.devhouse.comin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import java.security.AccessControlContext

class ViewPagerAdapter(private val context: Context) : PagerAdapter (){ //뷰페이저 어댑터

    private  var layoutInflater : LayoutInflater? = null

    val Image = arrayOf(
        R.drawable.ai,
        R.drawable.css,
        R.drawable.html

    )//이미지 넣을것들

    override fun getCount(): Int {
      return  Image.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.viewpager_actvitiy, null)
        val image = v.findViewById<View>(R.id.imageview) as ImageView

        image.setImageResource(Image[position])

        val vp = container as ViewPager
        vp.addView(v, 0);

        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)

    }

}