package com.example.nekoding_mobile.fragment

import android.app.ActionBar
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.nekoding_mobile.R
import com.example.nekoding_mobile.SlideAdapter
import com.example.nekoding_mobile.SliderItems
import com.example.nekoding_mobile.databinding.FragmentHomeBinding
import java.lang.Math.abs


class HomeFragment : Fragment() {


    private lateinit var binding : FragmentHomeBinding

    private lateinit var myDataList : ArrayList<SliderItems>
    private lateinit var slideAdapter: SlideAdapter
    lateinit var viewPager : ViewPager



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadCard()

        binding.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })

    }

    private fun loadCard() {
        myDataList = ArrayList()
        myDataList.add(SliderItems(R.drawable.slide_satu))
        myDataList.add(SliderItems(R.drawable.slide_dua))

        slideAdapter = SlideAdapter(requireContext(), myDataList)

        binding.viewPager.adapter = slideAdapter

        binding.apply {
            viewPager.setPadding(25,0,200,0)
            viewPager.clipToPadding = false
            viewPager.pageMargin = 25

        }

    }

}