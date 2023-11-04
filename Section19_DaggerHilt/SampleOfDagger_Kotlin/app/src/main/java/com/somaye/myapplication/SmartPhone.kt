package com.somaye.myapplication

import android.util.Log

class SmartPhone constructor (private val battery:Battery, private val simCard:SimCard, private val memoryCard: MemoryCard) {
    init {
        battery.getPower()
        simCard.getCommunication()
        memoryCard.getSpaceAvailability()
        Log.i("MyTag", "Smart phone  constructed")
    }

    fun makeACallWithRecording()
    {
        Log.i("MyTag", "calling ...")
    }

}