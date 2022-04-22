package com.best.a81k

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.best.a81k.Fragment.FirstFragment
import com.best.a81k.Fragment.SecondFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        open()
    }

    private fun open() {
        val intent = Intent(this, RunTimeActivity::class.java)
        startActivity(intent)
    }
}