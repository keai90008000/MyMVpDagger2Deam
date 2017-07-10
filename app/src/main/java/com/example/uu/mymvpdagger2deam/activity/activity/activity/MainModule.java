package com.example.uu.mymvpdagger2deam.activity.activity.activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by  on 2017/7/9.
 */
@Module
public class MainModule {
    private  MainContract.IMainView iMainView;

    public MainModule(MainContract.IMainView iMainView) {
        this.iMainView = iMainView;
    }
    @Provides
    MainContract.IMainView providesIMainView(){
        return iMainView;
    }
    //dagger2 里的提供
    @Provides
    MainContract.IMainModel providesIMainModel(){
        return new MainModel();
    }
}
