package com.instagramclone.shashankmahajan.instaclone.Profile;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.instagramclone.shashankmahajan.instaclone.R;
import com.instagramclone.shashankmahajan.instaclone.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by shashankmahajan on 24/02/18.
 */

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "Profile Activty";
    private static final int Activity_Num = 4;

    private Context mContext = ProfileActivity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG,"Oncreate : Started");

       // setupBottomNavigation();
        setupToolBar();
    }

    private void setupToolBar(){
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.profileToolBar);
        setSupportActionBar(toolbar);

        toolbar.setOnMenuItemClickListener(new android.support.v7.widget.Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Log.d(TAG,"onMenuClick : click menu item" +item);
                switch (item.getItemId()){

                    case R.id.profileMenu:
                        Log.d(TAG,"onMenuItemClick: Navigating to profile Preferences.");
                }

                return false;
            }
        });
    }

    //BottomNavigationView setup
    private void setupBottomNavigation(){
        Log.d(TAG, "setupBottomNavigation: setting up BottomNavigationView" );
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewbar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext,bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(Activity_Num);
        menuItem.setChecked(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_menu, menu);
        return true;
    }
}
