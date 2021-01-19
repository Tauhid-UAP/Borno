package com.borno3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.borno3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var shorbornoImageButton = binding.shorbornoImageButton
        var banjyonbornoImageButton = binding.banjyonbornoImageButton
        var shongkkhaImageButton = binding.shongkkhaImageButton

        shorbornoImageButton.setOnClickListener {
                val intent = Intent(this, Shorborno::class.java)
                startActivity(intent)
        }

        banjyonbornoImageButton.setOnClickListener {
            val intent = Intent(this, Banjyonborno::class.java)
            startActivity(intent)
        }

        shongkkhaImageButton.setOnClickListener {
            val intent = Intent(this, Shongkkha::class.java)
            startActivity(intent)
        }
    }
}
