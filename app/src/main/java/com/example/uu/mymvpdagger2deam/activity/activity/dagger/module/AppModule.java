package com.example.uu.mymvpdagger2deam.activity.activity.dagger.module;

import android.content.Context;

import com.example.uu.mymvpdagger2deam.activity.activity.utils.RetrofitUtils;

import dagger.Module;
import dagger.Provides;

/**
 * Created by  on 2017/7/9.
 */
@Module
public class AppModule {
   private Context context;

    public AppModule(Context context) {
        this.context = context;
    }
    @Provides
    RetrofitUtils providesRetrofitUtils(){
        return  new RetrofitUtils();
    }
    @Provides
    Context providesContext(){
        return  context;
    }
}
