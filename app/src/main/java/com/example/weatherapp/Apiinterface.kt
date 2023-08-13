package com.example.weatherapp

import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call

interface Apiinterface {
    @GET("weather")
    fun getWeatherData(
        @Query("q") city:String,
        @Query("appid") appid :String,
        @Query("units") units:String
    ) : Call<Weatherapp>
}