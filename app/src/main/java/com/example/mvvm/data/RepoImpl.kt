package com.example.mvvm.data

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.example.mvvm.domain.User

class RepoImpl : Repo {

    private var liveData = MutableLiveData<User>()
    private var user = User("John", "1234")

    init {
        liveData.value = user
    }

    companion object {
        val instance = RepoImpl()
    }

    override fun getData(): LiveData<User> {
        return liveData
    }

    override fun changeData() {
        liveData.value = user.apply {
            email="DOE"
        }
    }

}