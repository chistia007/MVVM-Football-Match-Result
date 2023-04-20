package com.example.mvvmproject.VIew.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mvvmproject.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}