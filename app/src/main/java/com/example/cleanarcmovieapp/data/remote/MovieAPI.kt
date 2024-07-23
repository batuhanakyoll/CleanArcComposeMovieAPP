package com.example.cleanarcmovieapp.data.remote

import com.example.cleanarcmovieapp.data.remote.dto.MovieDetailDto
import com.example.cleanarcmovieapp.data.remote.dto.MoviesDto
import com.example.cleanarcmovieapp.util.Constans.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {
    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString: String,
        @Query("apikey") apikey: String = API_KEY

    ): MoviesDto

    @GET(".")
    suspend fun getMovieDetail(
        @Query("i") searchString: String,
        @Query("apikey") apikey: String = API_KEY
    ): MovieDetailDto


}