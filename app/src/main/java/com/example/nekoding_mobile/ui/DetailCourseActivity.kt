package com.example.nekoding_mobile.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.core.content.ContextCompat
import com.example.nekoding_mobile.R
import com.example.nekoding_mobile.databinding.ActivityDetailCourseBinding

class DetailCourseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailCourseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailCourseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val window = this.window
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)

        supportActionBar?.hide()

    }
}