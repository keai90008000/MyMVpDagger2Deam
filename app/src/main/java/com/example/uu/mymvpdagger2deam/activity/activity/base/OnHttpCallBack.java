package com.example.uu.mymvpdagger2deam.activity.activity.base;

/**
 * Created by  on 2017/7/9.
 */
//ok的返回方法

public interface OnHttpCallBack<T> {
    void onSuccess(T t);
    void onError(String msg);
}
