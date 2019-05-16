package com.example.mvvm.next

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.mvvm.R
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity: AppCompatActivity() {

    private lateinit var nextViewModel: NextViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        nextViewModel = ViewModelProviders.of(this).get(NextViewModel::class.java)

        button.setOnClickListener {
            nextViewModel.changeName()
        }

    }

}