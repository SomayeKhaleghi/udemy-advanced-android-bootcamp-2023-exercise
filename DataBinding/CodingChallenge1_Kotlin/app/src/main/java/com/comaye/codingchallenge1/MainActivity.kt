package com.comaye.codingchallenge1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.comaye.codingchallenge1.databinding.ActivityMainBinding
//------------------------------------------------------------------------------------------
class MainActivity : AppCompatActivity() {

lateinit var  binding: ActivityMainBinding
    //------------------------------------------------------------------------------------------
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.button.setOnClickListener {  startOrStopProgressBar() }
    }
    //------------------------------------------------------------------------------------------
    fun startOrStopProgressBar()
    {
        binding.apply {
            if(button.text.equals(getString(R.string.start)))
            {
                progressBar.visibility = View.VISIBLE;
                button.setText(getString(R.string.stop))
            }
            else
            {
                progressBar.visibility = View.INVISIBLE;
                button.setText(getString(R.string.start))
            }
        }
    }
}