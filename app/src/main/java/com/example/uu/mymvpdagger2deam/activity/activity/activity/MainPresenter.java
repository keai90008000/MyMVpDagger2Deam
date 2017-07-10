package com.example.uu.mymvpdagger2deam.activity.activity.activity;

import android.content.Context;

import com.example.uu.mymvpdagger2deam.activity.activity.base.OnHttpCallBack;
import com.example.uu.mymvpdagger2deam.activity.activity.bean.DataUser;
import com.example.uu.mymvpdagger2deam.activity.activity.utils.RetrofitUtils;

import javax.inject.Inject;

/**
 * Presenter层 在这个类中只做Model和View的关联交互
 */
//presenter 层 实现了 @Inject 方法 交互 View和Model 在P层里

public class MainPresenter implements MainContract.IMainPresenter{
private Context context;
    private RetrofitUtils retrofitUtils;
    private  MainContract.IMainView iMainView;
    private MainContract.IMainModel mainModel;
@Inject
    public MainPresenter(Context context, RetrofitUtils retrofitUtils, MainContract.IMainView iMainView, MainContract.IMainModel mainModel) {
        this.context = context;
        this.retrofitUtils = retrofitUtils;
        this.iMainView = iMainView;
        this.mainModel = mainModel;
    }

    @Override
    public void dataOfView() {
    mainModel.getData(iMainView.getURL(), retrofitUtils, new OnHttpCallBack<DataUser>() {
        @Override
        public void onSuccess(DataUser dataUser) {
            iMainView.showInfo(dataUser);
        }

        @Override
        public void onError(String msg) {
         iMainView.showError(msg);
        }
    });
    }
}
