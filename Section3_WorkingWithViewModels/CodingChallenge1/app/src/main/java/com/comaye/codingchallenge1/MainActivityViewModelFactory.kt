package com.comaye.codingchallenge1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModelFactory(private val startingInput : Int):ViewModelProvider.Factory {
//---------------------------------------------------------------------------------------------------------------
override fun <T : ViewModel> create(modelClass: Class<T>): T {
    if (modelClass.isAssignableFrom(MainActivityViewModel::class.java))
    {
        return MainActivityViewModel(startingInput) as T
    }
    throw  java.lang.IllegalArgumentException("Unknown class")
}
//-----------------------------------------------------------------------------------------------------------------------
}