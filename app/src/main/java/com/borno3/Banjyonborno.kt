package com.borno3

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.borno3.databinding.ActivityBanjyonbornoBinding
import com.borno3.databinding.ActivityShorbornoBinding

class Banjyonborno : AppCompatActivity() {
    private lateinit var binding: ActivityBanjyonbornoBinding
    private val imageButtons = ArrayList<ImageButton>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBanjyonbornoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        imageButtons.add(binding.b1ImageButton)
        imageButtons.add(binding.b2ImageButton)
        imageButtons.add(binding.b3ImageButton)
        imageButtons.add(binding.b4ImageButton)
        imageButtons.add(binding.b5ImageButton)
        imageButtons.add(binding.b6ImageButton)
        imageButtons.add(binding.b7ImageButton)
        imageButtons.add(binding.b8ImageButton)
        imageButtons.add(binding.b9ImageButton)
        imageButtons.add(binding.b10ImageButton)
        imageButtons.add(binding.b11ImageButton)
        imageButtons.add(binding.b12ImageButton)
        imageButtons.add(binding.b13ImageButton)
        imageButtons.add(binding.b14ImageButton)
        imageButtons.add(binding.b15ImageButton)
        imageButtons.add(binding.b16ImageButton)
        imageButtons.add(binding.b17ImageButton)
        imageButtons.add(binding.b18ImageButton)
        imageButtons.add(binding.b19ImageButton)
        imageButtons.add(binding.b20ImageButton)
        imageButtons.add(binding.b21ImageButton)
        imageButtons.add(binding.b22ImageButton)
        imageButtons.add(binding.b23ImageButton)
        imageButtons.add(binding.b24ImageButton)
        imageButtons.add(binding.b25ImageButton)
        imageButtons.add(binding.b26ImageButton)
        imageButtons.add(binding.b27ImageButton)
        imageButtons.add(binding.b28ImageButton)
        imageButtons.add(binding.b29ImageButton)
        imageButtons.add(binding.b30ImageButton)
        imageButtons.add(binding.b31ImageButton)
        imageButtons.add(binding.b32ImageButton)
        imageButtons.add(binding.b33ImageButton)
        imageButtons.add(binding.b34ImageButton)
        imageButtons.add(binding.b35ImageButton)
        imageButtons.add(binding.b36ImageButton)
        imageButtons.add(binding.b37ImageButton)
        imageButtons.add(binding.b38ImageButton)
        imageButtons.add(binding.b39ImageButton)


        var lastMediaPlayer: MediaPlayer? = null

        for(i in 0 .. 38) {

            imageButtons[i].setOnClickListener {
                lastMediaPlayer?.stop()
                lastMediaPlayer?.release()

                var fileName = "vb" + (i + 1)
                var id = resources.getIdentifier(fileName, "raw", packageName)
                var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, id)
                mediaPlayer?.start()

                lastMediaPlayer = mediaPlayer
            }
        }

//        var a1ImageButton = binding.a1ImageButton
//
//        a1ImageButton.setOnClickListener {
//            var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.va1)
//            mediaPlayer?.start()
//        }

//        var verticalButtons = binding.verticalButtons
//        Log.d(null,"Child count = " + verticalButtons.childCount)
//        for(i in 0 .. verticalButtons.childCount){
//            var child = verticalButtons.getChildAt(i)
//
//
//            child.setOnClickListener {
//                var fileName = "va" + (i + 1)
//                var id = resources.getIdentifier(fileName, "raw", packageName)
//                var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, id)
//                mediaPlayer?.start()
//            }
//
//        }
//        for(i in 0 .. 10){
////            var buttonId = resources.getIdentifier("a" + (i + 1) + "ImageButton", "layout", packageName)
//
//
//            imageButtons[i].setOnClickListener {
//                var fileName = "va" + (i + 1)
//                var id = resources.getIdentifier(fileName, "raw", packageName)
//                var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, id)
//                mediaPlayer?.start()
//            }
//
//        }
    }
}