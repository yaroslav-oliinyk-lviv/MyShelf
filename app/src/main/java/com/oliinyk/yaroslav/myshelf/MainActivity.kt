package com.oliinyk.yaroslav.myshelf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oliinyk.yaroslav.myshelf.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}