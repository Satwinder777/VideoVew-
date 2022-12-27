package com.example.videoplayer

import android.net.Uri
import android.net.Uri.parse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.videoView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        val uri :Uri = parse("android.resource://"+packageName+"/"+R.raw.video)

        val btn = findViewById<Button>(R.id.button)
        val btn2 = findViewById<Button>(R.id.button2)
        videoView.setMediaController(mediaController)

        videoView.setVideoURI(uri)
        videoView.requestFocus()

        btn.setOnClickListener{
            videoView.start()

        }
        btn2.setOnClickListener{
            videoView.pause()

        }
    }
}