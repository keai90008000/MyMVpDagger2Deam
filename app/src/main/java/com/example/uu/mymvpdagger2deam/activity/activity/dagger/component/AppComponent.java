package com.example.uu.mymvpdagger2deam.activity.activity.dagger.component;

import android.content.Context;

import com.example.uu.mymvpdagger2deam.activity.activity.dagger.module.AppModule;
import com.example.uu.mymvpdagger2deam.activity.activity.utils.RetrofitUtils;

import dagger.Component;

/**
 * Created by  on 2017/7/9.
 */
//@Component
@Component(modules = AppModule.class)
public interface AppComponent {

    Context getContextCur();
    RetrofitUtils getRetrofitUtils();

}
