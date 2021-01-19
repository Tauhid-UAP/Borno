package com.borno3

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.borno3.databinding.ActivityShongkkhaBinding
import com.borno3.databinding.ActivityShorbornoBinding

class Shongkkha : AppCompatActivity() {
    private lateinit var binding: ActivityShongkkhaBinding
    private val imageButtons = ArrayList<ImageButton>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShongkkhaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        imageButtons.add(binding.c1ImageButton)
        imageButtons.add(binding.c2ImageButton)
        imageButtons.add(binding.c3ImageButton)
        imageButtons.add(binding.c4ImageButton)
        imageButtons.add(binding.c5ImageButton)
        imageButtons.add(binding.c6ImageButton)
        imageButtons.add(binding.c7ImageButton)
        imageButtons.add(binding.c8ImageButton)
        imageButtons.add(binding.c9ImageButton)
        imageButtons.add(binding.c10ImageButton)

        var lastMediaPlayer: MediaPlayer? = null

        for(i in 0 .. 9) {

            imageButtons[i].setOnClickListener {
                lastMediaPlayer?.stop()
                lastMediaPlayer?.release()

                var fileName = "vc" + i
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