package com.somaye.myapplication

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(private val serviceProvider:ServiceProvider) {
    init {
        Log.i("MyTag", "SimCard  constructed")
    }

    fun getCommunication()
    {
        Log.i("MyTag", "Service provider connected")
    }
}