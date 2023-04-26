package com.comaye.codingchallenge1

import androidx.lifecycle.ViewModel
class MainActivityViewModel: ViewModel() {
//-----------------------------------------------------------------------------------------
    private var input: Int = 0

    private var output: Int = 0

    //-----------------------------------------------------------------------------------------
    fun GetInput(): Int {
        return input
    }

    //-----------------------------------------------------------------------------------------
    fun Add(input:Int): Int {

        this.input  =input
        output+=input

        return output
    }


//-----------------------------------------------------------------------------------------
}