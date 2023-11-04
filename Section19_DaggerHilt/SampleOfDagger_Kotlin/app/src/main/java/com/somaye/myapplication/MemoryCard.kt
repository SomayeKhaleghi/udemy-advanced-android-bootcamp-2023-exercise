package com.somaye.myapplication

import android.util.Log

class MemoryCard {

        init {
            Log.i("MyTag", "MemoryCard Constructed!")
        }

        fun getSpaceAvailability()
        {
            Log.i("MyTag", "Memory space  is available")
        }
}