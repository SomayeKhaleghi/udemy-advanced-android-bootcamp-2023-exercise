package com.comaye.codingchallenge1

import androidx.lifecycle.ViewModel
class MainActivityViewModel(startingInput : Int): ViewModel(){
//-----------------------------------------------------------------------------------------
    private var input: Int = 0

    private var output: Int = 0

    //-----------------------------------------------------------------------------------------
    init {
        input = startingInput
        output = input
    }
    //-----------------------------------------------------------------------------------------
    fun GetInput(): Int {
        return input
    }
    //-----------------------------------------------------------------------------------------
    fun GetOutput(): Int {
        return output
    }
    //-----------------------------------------------------------------------------------------
    fun Add(input:Int): Int {

        this.input  =input
        output+=input

        return output
    }
//-----------------------------------------------------------------------------------------
}