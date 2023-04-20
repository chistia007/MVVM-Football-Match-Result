package com.example.mvvmproject.Service.Repository;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.example.mvvmproject.Service.Model.MovieModel;
import com.example.mvvmproject.Service.Network.ApiServices;
import com.example.mvvmproject.Service.Network.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

// will select from where data will come
public class MovieRepository {
    private static Context mcontext;
    private List<MovieModel> mResult;
    private MutableLiveData<List<MovieModel>> mutableLiveData;
    private static MovieRepository instance;

    public static MovieRepository getInstance(Context context){
        if (instance==null){
            mcontext=context;
            instance=new MovieRepository();
        }
        return instance;
    }

    public MutableLiveData<List<MovieModel>> getTopRatedMovieLists(){
        if(mutableLiveData==null){
            mutableLiveData=new MutableLiveData<List<MovieModel>>();
        }

        ApiServices apiServices= RetrofitInstance.getRetrofitInstance().create(ApiServices.class);
        Call<List<MovieModel>> call= apiServices.getTopRatedMovieList();
        call.enqueue(new Callback<List<MovieModel>>() {
            @Override
            public void onResponse(Call<List<MovieModel>> call, Response<List<MovieModel>> response) {
                mResult= response.body();
                mutableLiveData.postValue(mResult);
            }

            @Override
            public void onFailure(Call<List<MovieModel>> call, Throwable t) {

            }
        });

        return mutableLiveData;
    }
}