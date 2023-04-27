package com.comaye.codingchallenge1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.comaye.codingchallenge1.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil.setContentView
import androidx.lifecycle.Observer
//------------------------------------------------------------------------------------------------------
class MainActivity : AppCompatActivity() {
//------------------------------------------------------------------------------------------------------
private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =   setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(0)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainActivityViewModel::class.java)

        viewModel.countData.observe(this, Observer {
            binding.countText.text = it.toString()
        })

        binding.button.setOnClickListener {
            viewModel.updateCount()
        }
    }
//------------------------------------------------------------------------------------------------------
}
//------------------------------------------------------------------------------------------------------