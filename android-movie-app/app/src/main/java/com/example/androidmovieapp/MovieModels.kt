package com.example.androidmovieapp

import com.google.gson.annotations.SerializedName

data class MovieSearchResponse(
    @SerializedName("Search")
    val Search: List<Movie>?,
    @SerializedName("totalResults")
    val totalResults: String?,
    @SerializedName("Response")
    val Response: String?
)

data class Movie(
    @SerializedName("Title")
    val Title: String,
    @SerializedName("Year")
    val Year: String,
    @SerializedName("imdbID")
    val imdbID: String,
    @SerializedName("Type")
    val Type: String,
    @SerializedName("Poster")
    val Poster: String
)
