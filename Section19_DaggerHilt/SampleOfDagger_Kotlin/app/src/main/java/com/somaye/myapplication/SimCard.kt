package com.somaye.myapplication

import android.util.Log

class SimCard constructor(private val serviceProvider:ServiceProvider) {
    init {
        Log.i("MyTag", "SimCard  constructed")
    }

    fun getCommunication()
    {
        Log.i("MyTag", "Service provider connected")
    }
}