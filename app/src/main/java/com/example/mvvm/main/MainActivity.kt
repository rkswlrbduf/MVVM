package com.example.mvvm.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mvvm.next.NextActivity
import com.example.mvvm.R
import com.example.mvvm.domain.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var nameViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        nameViewModel.liveData?.observe(this, Observer<User> {
            name_tv.text = it?.email
            Log.d("TAG", "Observer")
        })

        next.setOnClickListener {
            startActivity(Intent(this, NextActivity::class.java))
        }

    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume")
    }

}
