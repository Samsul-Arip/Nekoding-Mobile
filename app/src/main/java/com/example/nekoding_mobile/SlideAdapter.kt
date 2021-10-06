package com.example.nekoding_mobile

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import com.example.nekoding_mobile.ui.DetailCourseActivity


class SlideAdapter (val context: Context, val slideItems : ArrayList<SliderItems>) : PagerAdapter() {
    override fun getCount(): Int {
        return slideItems.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view.equals(`object`)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val view = LayoutInflater.from(context).inflate(R.layout.slide_items, container, false)

        val list = slideItems[position]
        val image = list.img
        val img = view.findViewById<ImageView>(R.id.imageItemSatu)

        img.setImageResource(image)

        view.setOnClickListener {
            val intent = Intent(context, DetailCourseActivity::class.java)
            context.startActivity(intent)
        }

        container.addView(view, position)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}