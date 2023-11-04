package com.somaye.myapplication

import android.util.Log

class Battery {

   init {
       Log.i("MyTag", "Battery Constructed!")
   }

    fun getPower()
    {
        Log.i("MyTag", "Battery  Power is available!")
    }
}