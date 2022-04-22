package com.best.a81k.Fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.best.a81k.R
import java.lang.Exception


class SecondFragment : Fragment() {
    var listener: Listener? = null
    lateinit var textView: TextView
    lateinit var button: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_secondfragment, container, false)

        textView = view.findViewById(R.id.textS)
        button = view.findViewById(R.id.buttonS)

        button.setOnClickListener {
            listener?.onSend("Second data")
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Listener) {
            listener = context
        } else {
            throw Exception("Error!")
        }

    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
    fun updateS(updater:String){
        textView.text=updater
    }

    interface Listener {
        fun onSend(data: String)
    }
}