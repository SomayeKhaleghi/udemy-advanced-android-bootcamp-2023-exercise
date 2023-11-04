package com.somaye.myapplication

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){

   init {
       Log.i("MyTag", "Battery Constructed!")
   }

    fun getPower()
    {
        Log.i("MyTag", "Battery  Power is available!")
    }
}