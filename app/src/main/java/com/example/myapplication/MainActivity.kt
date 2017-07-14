package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    private val TAG: String = "MainActivityTAG_"

    @Inject
    lateinit var sharedManager: SharedManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectDependencies()

        a_main_get.setOnClickListener { Log.d(TAG, sharedManager.getValue()) }
        a_main_put.setOnClickListener { sharedManager.addValue(Date().toString()) }
    }

    private fun injectDependencies() {
        DaggerMainComponent.builder()
                .dataModule(DataModule(this))
                .build()
                .inject(this)
    }
}
