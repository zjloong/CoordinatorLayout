package com.heihei.hehe.coordinatorlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.heihei.hehe.coordinatorlayout.bottomnavigation.BottomNavigationActivity;
import com.heihei.hehe.coordinatorlayout.bottomsheet.BottomSheetActivity;
import com.heihei.hehe.coordinatorlayout.floatbutton.FloatButtonActivity;
import com.heihei.hehe.coordinatorlayout.enterAlways.EnterAlwaysActivity;
import com.heihei.hehe.coordinatorlayout.enterAlways.EnterAlwaysCollapsedActivity;
import com.heihei.hehe.coordinatorlayout.enterAlways.EnterAlwaysCollapsedInToolbarLayoutActivity;
import com.heihei.hehe.coordinatorlayout.enterAlways.EnterAlwaysWithTabLayoutActivity;
import com.heihei.hehe.coordinatorlayout.exitUntilCollapsed.ToolbarLayoutActivity;
import com.heihei.hehe.coordinatorlayout.exitUntilCollapsed.ToolbarLayoutWithParallaxActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void floatButton(View v){
        startActivity(new Intent(this,FloatButtonActivity.class));
    }

    public void queckback(View v){
        startActivity(new Intent(this,EnterAlwaysActivity.class));
    }

    public void queckbackWithTablayout(View v){
        startActivity(new Intent(this,EnterAlwaysWithTabLayoutActivity.class));
    }

    public void queckbackWithMinHeight(View v){
        startActivity(new Intent(this,EnterAlwaysCollapsedActivity.class));
    }

    public void queckbackWithMinHeightInToolbarLayout(View v){
        startActivity(new Intent(this,EnterAlwaysCollapsedInToolbarLayoutActivity.class));
    }

    public void closetoolbar(View v){
        startActivity(new Intent(this,ToolbarLayoutActivity.class));
    }

    public void closetoolbarwithparallax(View v){
        startActivity(new Intent(this,ToolbarLayoutWithParallaxActivity.class));
    }

    public void bottomsheet(View v){
        startActivity(new Intent(this,BottomSheetActivity.class));
    }

    public void bottomnavigation(View v){
        startActivity(new Intent(this,BottomNavigationActivity.class));
    }
}
