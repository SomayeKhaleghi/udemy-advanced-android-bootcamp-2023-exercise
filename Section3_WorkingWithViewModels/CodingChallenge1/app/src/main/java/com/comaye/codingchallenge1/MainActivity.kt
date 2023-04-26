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
    private lateinit var viewModelFactory: MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =   setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainActivityViewModel::class.java)


        
        binding.input.hint = (viewModel.GetTotal().toString())
        binding.output.text =viewModel.GetTotal().toString()

        binding.button.setOnClickListener {
            viewModel.setTotal(binding.input.text.toString().toInt())


            binding.output.text = viewModel.GetTotal().toString()
            binding.input.hint = viewModel.GetTotal().toString()
        }
    }
//------------------------------------------------------------------------------------------------------
}
//------------------------------------------------------------------------------------------------------