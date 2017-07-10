package com.example.uu.mymvpdagger2deam.activity.activity.activity;

import com.example.uu.mymvpdagger2deam.activity.activity.base.OnHttpCallBack;
import com.example.uu.mymvpdagger2deam.activity.activity.bean.DataUser;
import com.example.uu.mymvpdagger2deam.activity.activity.utils.RetrofitUtils;

/**
 * Created by  on 2017/7/9.
 * 定义的接口
 */

public class MainContract {
    interface IMainView{
        String getURL();
        void showInfo(DataUser dataUser);
        void  showError(String msg);
    }
    //model层接口
    interface IMainModel{
        void getData(String url, RetrofitUtils retrofitUtils, OnHttpCallBack<DataUser> callBack);
    }
    //presenter 层接口
    public interface  IMainPresenter{
        void dataOfView();
    }
}
