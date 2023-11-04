package com.somaye.myapplication

import android.util.Log

class ServiceProvider {
    init {
        Log.i("MyTag", "Service provider  constructed")
    }

    fun getServiceProvider()
    {
        Log.i("MyTag", "Service provider connected")
    }

}