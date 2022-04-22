package com.best.a81k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.best.a81k.Fragment.FirstFragment
import com.best.a81k.Fragment.SecondFragment

class RunTimeActivity : AppCompatActivity(), FirstFragment.ListenerA, SecondFragment.Listener {
    private var firstFragment: FirstFragment? = null
    private var secondFragment: SecondFragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_run_time)
        initviews()
    }

    fun initviews() {
        firstFragment = FirstFragment()
        secondFragment = SecondFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.mainMF, firstFragment!!)
            .replace(R.id.mainMS, secondFragment!!)
            .commit()
    }

    override fun onSendA(data: String) {
        firstFragment?.updateF(data)
    }

    override fun onSend(data: String) {
        secondFragment?.updateS(data)
    }
}