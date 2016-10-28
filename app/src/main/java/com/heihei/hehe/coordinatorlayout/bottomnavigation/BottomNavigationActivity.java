package com.heihei.hehe.coordinatorlayout.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.heihei.hehe.coordinatorlayout.R;

public class BottomNavigationActivity extends AppCompatActivity {

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item1:
                        navigationView.setItemBackgroundResource(R.color.color_1ec859);
                        break;
                    case R.id.item2:
                        navigationView.setItemBackgroundResource(R.color.color_3b93eb);
                        break;
                    case R.id.item3:
                        navigationView.setItemBackgroundResource(R.color.color_ffa973);
                        break;
                    case R.id.item4:
                        navigationView.setItemBackgroundResource(R.color.color_ffbc00);
                        break;
                }
                Toast.makeText(BottomNavigationActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}
