package com.example.mvvmproject.VIewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.mvvmproject.Service.Model.MovieModel;
import com.example.mvvmproject.Service.Repository.MovieRepository;

import java.util.List;

public class MovieListViewModel extends AndroidViewModel {

    private MovieRepository movieRepository;

    public MovieListViewModel(@NonNull Application application) {
        super(application);
        movieRepository= MovieRepository.getInstance(application);
    }
    public MutableLiveData<List<MovieModel>> getTopRatedMovieLists(){
        return movieRepository.getTopRatedMovieLists();
    }
}
