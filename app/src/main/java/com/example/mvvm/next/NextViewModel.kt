package com.example.mvvm.next

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.example.mvvm.data.RepoImpl
import com.example.mvvm.domain.User

class NextViewModel : ViewModel() {

    private var repoImpl: RepoImpl = RepoImpl.instance

    fun changeName() {
        repoImpl.changeData()
    }

}