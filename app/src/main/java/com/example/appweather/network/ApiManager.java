package com.example.appweather.network;

import com.example.appweather.model.Weather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    public static String BASE_URL = "https://dataservice.accuweather.com/";

    @GET("http://dataservice.accuweather.com/alarms/v1/1day/353412?apikey=YvLXLyI3SiE8xuQKF3p4A1B1I1RksiXR&language=vi-vn")
    Call<List<Weather>> gethour();

    @GET("http://dataservice.accuweather.com/alarms/v1/5day/353412?apikey=93Qg780lHwYM4SO58n7DFPLqHg4oKADn&language=vi-vn")
    Call<List<Weather>> getDay();
}
