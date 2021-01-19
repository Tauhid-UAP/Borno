package com.borno3

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import com.borno3.databinding.ActivityShorbornoBinding

class Shorborno : AppCompatActivity() {
    private lateinit var binding: ActivityShorbornoBinding
    private val imageButtons = ArrayList<ImageButton>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShorbornoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        imageButtons.add(binding.a1ImageButton)
        imageButtons.add(binding.a2ImageButton)
        imageButtons.add(binding.a3ImageButton)
        imageButtons.add(binding.a4ImageButton)
        imageButtons.add(binding.a5ImageButton)
        imageButtons.add(binding.a6ImageButton)
        imageButtons.add(binding.a7ImageButton)
        imageButtons.add(binding.a8ImageButton)
        imageButtons.add(binding.a9ImageButton)
        imageButtons.add(binding.a10ImageButton)
        imageButtons.add(binding.a11ImageButton)

        var lastMediaPlayer: MediaPlayer? = null

        for(i in 0 .. 10) {

            imageButtons[i].setOnClickListener {
                lastMediaPlayer?.stop()
                lastMediaPlayer?.release()

                var fileName = "va" + (i + 1)
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