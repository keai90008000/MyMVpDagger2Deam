package com.example.uu.mymvpdagger2deam.activity.activity.activity;

import com.example.uu.mymvpdagger2deam.activity.activity.dagger.component.AppComponent;

import dagger.Component;

/**
 * Created by  on 2017/7/9.
 */
//桥梁Component
@Component(dependencies = AppComponent.class,modules = MainModule.class)
  public interface MainComponet {
   void inject(MainActivity  mainActivity);
}
