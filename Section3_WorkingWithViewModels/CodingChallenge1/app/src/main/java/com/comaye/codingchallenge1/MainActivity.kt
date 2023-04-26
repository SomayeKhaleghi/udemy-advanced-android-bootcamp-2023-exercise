package com.comaye.codingchallenge1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.comaye.codingchallenge1.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil.setContentView
//------------------------------------------------------------------------------------------------------
class MainActivity : AppCompatActivity() {
//------------------------------------------------------------------------------------------------------
private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =   setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.input.hint = (viewModel.GetInput().toString())
        binding.output.text =viewModel.Add(binding.input.text.toString().toInt()).toString()

        binding.button.setOnClickListener {
            binding.output.text =viewModel.Add(binding.input.text.toString().toInt()).toString()
            binding.input.hint = (viewModel.GetInput().toString())

        }

    }
//------------------------------------------------------------------------------------------------------
}
//------------------------------------------------------------------------------------------------------