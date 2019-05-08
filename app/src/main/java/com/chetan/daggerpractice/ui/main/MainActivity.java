package com.chetan.daggerpractice.ui.main;

import android.os.Bundle;
import android.widget.Toast;

import com.chetan.daggerpractice.BaseActivity;
import com.chetan.daggerpractice.R;

import androidx.annotation.Nullable;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this , "Main Activity" , Toast.LENGTH_SHORT).show();
    }
}
