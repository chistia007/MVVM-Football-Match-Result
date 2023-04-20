package com.example.mvvmproject.VIew.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.mvvmproject.R;
import com.example.mvvmproject.Service.Model.MovieModel;
import com.example.mvvmproject.VIewModel.MovieListViewModel;
import com.example.mvvmproject.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public List<MovieModel> mList;
    ActivityMainBinding binding;

    private MovieListViewModel movieListViewModel;
    //private MovieListAdapter movieListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnGetResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movieListViewModel = new ViewModelProvider(MainActivity.this).get(MovieListViewModel.class);
                movieListViewModel.getTopRatedMovieLists().observe(MainActivity.this, new Observer<List<MovieModel>>() {
                    @Override
                    public void onChanged(List<MovieModel> movieModel) {
                        Log.d("TAG", "onChanged: dsdsdsd");
                        Toast.makeText(MainActivity.this, movieModel.get(0).getTournament(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });



    }
}