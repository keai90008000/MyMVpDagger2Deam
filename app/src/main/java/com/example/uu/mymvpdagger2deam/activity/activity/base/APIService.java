package com.example.uu.mymvpdagger2deam.activity.activity.base;


import com.example.uu.mymvpdagger2deam.activity.activity.bean.DataUser;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by  on 2017/7/9.
 */
//Rxjava的注解
public interface APIService {
    @GET("api/data/Android/10/1")
    Observable<DataUser> getData();
}
