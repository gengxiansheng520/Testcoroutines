package com.example.MyApplication2.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.MyApplication2.data.api.ApiHelper
import com.example.MyApplication2.data.api.MainRepository
import com.example.MyApplication2.ui.main.viewmodel.MainViewModel

/**
 *  author : 黄灿
 *  data : 2021/4/20 23:42
 *  description :
 */
class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}