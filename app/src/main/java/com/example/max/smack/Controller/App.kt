package com.example.max.smack.Controller

import android.app.Application
import android.content.SharedPreferences
import com.example.max.smack.Utilities.SharedPrefs

class App :Application() {

    companion object {
        lateinit var prefs: SharedPrefs

    }

    override fun onCreate() {
        prefs = SharedPrefs(applicationContext)
        super.onCreate()
    }
}