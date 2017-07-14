package com.example.myapplication

import android.content.SharedPreferences

/**
 * Created by user on 7/13/17.
 */
class SharedManager(val sharedPreferences: SharedPreferences) {

    private val MY_KEY: String = "MY_SHARED_KEY"
    private val MY_DEFAULT_KEY: String = "MY_DEFAULT_KEY"

    fun addValue(data: String) {
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString(MY_KEY, data)
        editor.apply()
    }

    fun getValue(): String {
        return sharedPreferences.getString(MY_KEY, MY_DEFAULT_KEY);
    }
}