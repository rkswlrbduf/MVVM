package com.example.mvvm.main

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.example.mvvm.data.RepoImpl
import com.example.mvvm.domain.User

class MainViewModel : ViewModel() {

    private var repoImpl: RepoImpl = RepoImpl.instance

    var liveData: LiveData<User>? = repoImpl.getData()

    fun buttonNameClicked(): LiveData<User> {
        if(liveData == null) liveData = repoImpl.getData()
        return liveData!!
    }

}