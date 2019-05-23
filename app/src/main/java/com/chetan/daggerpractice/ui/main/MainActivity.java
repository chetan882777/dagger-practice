package com.chetan.daggerpractice.ui.main;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.chetan.daggerpractice.BaseActivity;
import com.chetan.daggerpractice.R;
import com.chetan.daggerpractice.ui.main.profile.ProfileFragment;

import androidx.annotation.Nullable;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testFragment();
    }

    private void testFragment(){
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_container, new ProfileFragment())
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.logout_action:
                sessionManager.logOut();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
