package com.example.napat.myapplication

import android.database.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.*

interface GithubService {
    @GET("/users/{username}")
    fun getGithubUser(@Path("username") username: String) :Observable<User
            >
}