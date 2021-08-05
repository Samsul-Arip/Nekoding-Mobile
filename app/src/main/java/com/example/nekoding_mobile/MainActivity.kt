package com.example.nekoding_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.nekoding_mobile.databinding.ActivityMainBinding
import com.example.nekoding_mobile.fragment.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val onNavigationSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId) {
            R.id.home_menu -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.search_menu -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.video_menu -> {
                return@OnNavigationItemSelectedListener true

            }
            R.id.person_menu -> {

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadFragment(HomeFragment())
        binding.bNavigation.setOnNavigationItemSelectedListener(onNavigationSelectedListener)

    }

    private fun loadFragment(fragment : Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fContainer, fragment)
            .commit()
    }

}