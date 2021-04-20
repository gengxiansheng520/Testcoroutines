package com.example.MyApplication2.data.api

/**
 *  author : 黄灿
 *  data : 2021/4/20 23:41
 *  description :
 */
class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}