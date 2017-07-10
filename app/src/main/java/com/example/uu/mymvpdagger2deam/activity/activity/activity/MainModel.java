package com.example.uu.mymvpdagger2deam.activity.activity.activity;

import com.example.uu.mymvpdagger2deam.activity.activity.base.APIService;
import com.example.uu.mymvpdagger2deam.activity.activity.base.OnHttpCallBack;
import com.example.uu.mymvpdagger2deam.activity.activity.bean.DataUser;
import com.example.uu.mymvpdagger2deam.activity.activity.utils.RetrofitUtils;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by  on 2017/7/9.
 */

public class MainModel implements MainContract.IMainModel{
    @Override
    //retrof 工具类 和 Ok 的请求方法
    public void getData(String url, RetrofitUtils retrofitUtils, final OnHttpCallBack<DataUser> callBack) {
        retrofitUtils.baseUrl(url)
                .create(APIService.class)
                .getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<DataUser>() {
                    @Override
                    public void accept(@NonNull DataUser dataUser) throws Exception {
                      callBack.onSuccess(dataUser);
                    }
                },new Consumer<Throwable>(){
                               @Override
                               public void accept(@NonNull Throwable throwable) throws Exception {
                                   callBack.onError(throwable.toString());
                               }
                           }
                );
    }
}
