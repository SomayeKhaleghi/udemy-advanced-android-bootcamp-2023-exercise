package com.comaye.codingchallenge1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.comaye.codingchallenge1.databinding.ActivityMainBinding
//------------------------------------------------------------------------------------------
class MainActivity : AppCompatActivity() {

lateinit var  binding: ActivityMainBinding
    //------------------------------------------------------------------------------------------
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
    //------------------------------------------------------------------------------------------
}