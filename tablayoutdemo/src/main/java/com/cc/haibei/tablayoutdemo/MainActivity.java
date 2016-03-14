package com.cc.haibei.tablayoutdemo;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = (TabLayout) findViewById(R.id.main_tb_layout);

        //给TabLayout 添加Tab按钮
        mTabLayout.addTab(mTabLayout.newTab().setText("展览"));
        mTabLayout.addTab(mTabLayout.newTab().setText("作品"));
        mTabLayout.addTab(mTabLayout.newTab().setText("艺术家"));
        mTabLayout.addTab(mTabLayout.newTab().setText("机构"));
        //设置可滚动
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }
}
