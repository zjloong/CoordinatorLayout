package com.heihei.hehe.coordinatorlayout.enterAlways;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.heihei.hehe.coordinatorlayout.R;

public class EnterAlwaysWithTabLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queck_back_with_tab_layout);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("aa"));
        tabLayout.addTab(tabLayout.newTab().setText("bb"));
        tabLayout.addTab(tabLayout.newTab().setText("cc"));
        tabLayout.addTab(tabLayout.newTab().setText("dd"));
        tabLayout.addTab(tabLayout.newTab().setText("ee"));
        tabLayout.addTab(tabLayout.newTab().setText("aa"));
        tabLayout.addTab(tabLayout.newTab().setText("bb"));
        tabLayout.addTab(tabLayout.newTab().setText("cc"));
        tabLayout.addTab(tabLayout.newTab().setText("dd"));
        tabLayout.addTab(tabLayout.newTab().setText("ee"));
    }
}
