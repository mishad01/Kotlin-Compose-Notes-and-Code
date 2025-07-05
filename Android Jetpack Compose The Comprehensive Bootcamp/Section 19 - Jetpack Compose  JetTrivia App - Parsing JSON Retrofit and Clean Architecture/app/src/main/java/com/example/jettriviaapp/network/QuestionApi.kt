package com.example.jettriviaapp.network
import com.example.jettriviaapp.data.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {
    @GET("world.json")

    suspend fun getAllQuestion():Question
}