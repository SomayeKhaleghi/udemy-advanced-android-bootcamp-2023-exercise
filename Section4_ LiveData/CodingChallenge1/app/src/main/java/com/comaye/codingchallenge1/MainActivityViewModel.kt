package com.comaye.codingchallenge1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
class MainActivityViewModel(startingInput : Int): ViewModel(){
//-----------------------------------------------------------------------------------------
   private var count= MutableLiveData<Int>()
    val  countData :LiveData<Int>
    get() = count

    //-----------------------------------------------------------------------------------------
    init {
        count.value = startingInput
    }
    //-----------------------------------------------------------------------------------------
    fun updateCount() {
        count.value = (count.value)?.plus(1)

    }
//-----------------------------------------------------------------------------------------
}