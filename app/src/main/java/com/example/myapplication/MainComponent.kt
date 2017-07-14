package com.example.myapplication

import dagger.Component

/**
 * Created by user on 7/13/17.
 */
@Component(modules = arrayOf(DataModule::class))
interface MainComponent {
    fun inject(mainActivity: MainActivity);
}