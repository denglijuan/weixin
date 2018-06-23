package com.zpx.weixin;

import android.app.FragmentManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView txt_title;
    private FrameLayout fl_content;
    private Context mcontext;
    private ArrayList<Data> datas = null;
    private FragmentManager fManager = null;
    private  long exitTime = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcontext = MainActivity.this;
        fManager = getFragmentManager();
        bindViews();
        datas = new ArrayList<Data>();
        for (int i =1 ; i<=20;i++){
            Data data = new Data ("新闻标题"+ i ,i + "新闻内容");
            datas.add(data);
        }
    }
    private void bindViews(){
        txt_title = findViewById(R.id.txt_title);
        fl_content = findViewById(R.id.fl_content);
    }
}
