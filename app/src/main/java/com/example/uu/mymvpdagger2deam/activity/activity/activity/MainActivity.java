package com.example.uu.mymvpdagger2deam.activity.activity.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.uu.mymvpdagger2deam.R;
import com.example.uu.mymvpdagger2deam.activity.activity.bean.DataUser;
import com.example.uu.mymvpdagger2deam.activity.activity.dagger.component.DaggerAppComponent;
import com.example.uu.mymvpdagger2deam.activity.activity.dagger.module.AppModule;

import javax.inject.Inject;
//实现View
public class MainActivity extends AppCompatActivity implements  MainContract.IMainView{
    //@Inject 注解方式
     @Inject

     MainPresenter mainPresenter;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.text1);
        //Dagger2 使用了建造者模式
        DaggerMainComponet.builder()
                .appComponent(DaggerAppComponent.builder()
                .appModule(new AppModule(this)).build())
                .mainModule(new MainModule(this)).build().inject(this);
        mainPresenter.dataOfView();
    }

    @Override
    public String getURL() {
        return "http://gank.io/";
    }

    @Override
    public void showInfo(DataUser dataUser) {
     text1.setText(dataUser.getResults().toString());
    }

    @Override
    public void showError(String msg) {
        Toast.makeText(this, "失败", Toast.LENGTH_SHORT).show();
    }
}
