package com.example.gitpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun doStash(){
        println("Stash Changes")
        println("This function will go on Experiment Branch")
        println("Change 2 on Experiment Branch")
    }
}