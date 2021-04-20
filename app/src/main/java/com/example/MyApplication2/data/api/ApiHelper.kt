package com.example.MyApplication2.data.api

/**
 *  author : 黄灿
 *  data : 2021/4/20 23:40
 *  description :
 */
class ApiHelper(private val apiService: ApiService) {

    suspend fun getUsers() = apiService.getUsers()
}