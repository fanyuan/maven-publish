package com.example.mavendemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demo01.Demo01

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Demo01.log("this is a maven test")
    }
}