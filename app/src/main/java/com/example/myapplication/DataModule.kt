package com.example.myapplication

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides

/**
 * Created by user on 7/13/17.
 */

@Module
class DataModule(val context: Context) {

    @Provides
    fun provideSharedPreferences(): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    @Provides
    fun provideSharedManager(sharedPreferences: SharedPreferences): SharedManager {
        return SharedManager(sharedPreferences)
    }
}