package com.example.uu.mymvpdagger2deam.activity.activity.utils;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by  on 2017/7/9.
 */

public class RetrofitUtils {
    public Retrofit baseUrl(String url){
        return  new Retrofit.Builder().
                baseUrl(url).
                addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
