package com.somaye.myapplication

import dagger.Component

@Component
interface SmartPhoneComponent {
    fun getSmartPhone():SmartPhone
}