package com.example.MyApplication2.data.api

import com.example.MyApplication2.data.model.User
import retrofit2.http.GET

/**
 *  author : 黄灿
 *  data : 2021/4/20 23:38
 *  description :
 */
interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}