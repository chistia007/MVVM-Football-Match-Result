package com.example.mvvmproject.Service.Network;

import com.example.mvvmproject.Service.Model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    @GET("v1/3b613eec-3061-44bb-844c-f58c217d5063")
    Call<List<MovieModel>> getTopRatedMovieList();
}
