package com.somaye.myapplication

import dagger.Component

@Component (modules = [MemoryCardModule::class])
interface SmartPhoneComponent {
    fun getSmartPhone():SmartPhone
}