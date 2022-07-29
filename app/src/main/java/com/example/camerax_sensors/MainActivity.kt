package com.example.camerax_sensors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Go to Camera Activity
        val btnCamera: Button = findViewById(R.id.btn_go_camera)
        btnCamera.setOnClickListener{
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }
        /*
        // Go to Video Activity
        val btnVideo : Button = findViewById(R.id.btn_go_video);
        btnVideo.setOnClickListener{
            val intent = Intent(this, VideoActivity::class.java)
            startActivity(intent)
        }
        */
    }


}