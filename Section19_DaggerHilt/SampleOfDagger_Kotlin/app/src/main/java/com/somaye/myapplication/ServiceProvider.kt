package com.somaye.myapplication

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {
    init {
        Log.i("MyTag", "Service provider  constructed")
    }

    fun getServiceProvider()
    {
        Log.i("MyTag", "Service provider connected")
    }

}