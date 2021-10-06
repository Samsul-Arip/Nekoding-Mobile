package com.example.nekoding_mobile

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
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

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val window = this.window
        window.statusBarColor = ContextCompat.getColor(this, R.color.blueDark)

        loadFragment(HomeFragment())
        binding.bNavigation.setOnNavigationItemSelectedListener(onNavigationSelectedListener)

        supportActionBar?.hide()

    }

    private fun loadFragment(fragment : Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fContainer, fragment)
            .commit()
    }

}