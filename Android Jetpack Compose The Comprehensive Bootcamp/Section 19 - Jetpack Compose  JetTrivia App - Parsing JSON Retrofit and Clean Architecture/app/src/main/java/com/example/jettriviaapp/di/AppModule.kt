package com.example.jettriviaapp.di

import com.example.jettriviaapp.network.QuestionApi
import com.example.jettriviaapp.repository.QuestionRepository
import com.example.jettriviaapp.utils.Constants
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideQuestionApi(): QuestionApi {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build().create(QuestionApi::class.java)
    }

    @Singleton
    @Provides
    fun provideQuestionRepository(api: QuestionApi)=QuestionRepository(api)
}