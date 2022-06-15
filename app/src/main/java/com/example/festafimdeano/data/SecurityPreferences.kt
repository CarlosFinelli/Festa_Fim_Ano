package com.example.festafimdeano.data

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

class SecurityPreferences {
    lateinit var sharedPreferences: SharedPreferences

    constructor(context: Context) {
        sharedPreferences = context.getSharedPreferences("FestaFimAno", MODE_PRIVATE)

    }

    fun storeString(key: String, value: String) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun getStoredString(key: String) : String? {
        return sharedPreferences.getString(key, "")
    }
}