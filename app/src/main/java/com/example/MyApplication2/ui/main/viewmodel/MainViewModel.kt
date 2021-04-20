package com.example.MyApplication2.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.MyApplication2.data.api.MainRepository
import com.example.MyApplication2.utils.Resource
import kotlinx.coroutines.Dispatchers

/**
 *  author : 黄灿
 *  data : 2021/4/20 23:41
 *  description :
 */
class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getUsers() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getUsers()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}