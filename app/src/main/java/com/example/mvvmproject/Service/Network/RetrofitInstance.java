package com.example.mvvmproject.Service.Network;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    public static String BASE_URL="https://mocki.io/";
    private static Retrofit retrofit;      //Retrofit2

    // it will create instance of retrofit
    public static Retrofit getRetrofitInstance(){
        if (retrofit==null){
            retrofit= new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

}
