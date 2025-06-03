package com.example.androidmovieapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OmdbApi {
    @GET("/")
    suspend fun searchMovies(
        @Query("apikey") apiKey: String,
        @Query("s") search: String
    ): Response<MovieSearchResponse>
}
