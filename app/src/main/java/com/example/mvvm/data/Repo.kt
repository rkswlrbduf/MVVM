package com.example.mvvm.data

import android.arch.lifecycle.LiveData
import com.example.mvvm.domain.User

interface Repo {

    fun getData(): LiveData<User>
    fun changeData()

}