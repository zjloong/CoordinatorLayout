package com.heihei.hehe.coordinatorlayout.bottomsheet;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.heihei.hehe.coordinatorlayout.R;

public class BottomSheetActivity extends AppCompatActivity {

    private BottomSheetBehavior sheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);
        sheetBehavior = BottomSheetBehavior.from(findViewById(R.id.scroll));
        // 状态监听
        sheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                // 状态改变时回调
                if(newState == BottomSheetBehavior.STATE_EXPANDED){
                    Toast.makeText(bottomSheet.getContext(),"打开了",Toast.LENGTH_SHORT).show();
                }else if(newState == BottomSheetBehavior.STATE_COLLAPSED){
                    Toast.makeText(bottomSheet.getContext(),"关闭了",Toast.LENGTH_SHORT).show();
                }else if(newState == BottomSheetBehavior.STATE_HIDDEN){
                    Toast.makeText(bottomSheet.getContext(),"隐藏了",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                // 拖动时回调
            }
        });
    }

    public void open(View v){
        sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
    }

    public void close(View v){
        sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    }

    public void dialog(View v){
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(v.getContext());
        bottomSheetDialog.setContentView(R.layout.content_scrolling);
        bottomSheetDialog.show();
    }
}
