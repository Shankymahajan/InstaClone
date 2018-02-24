package com.instagramclone.shashankmahajan.instaclone.Likes;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.instagramclone.shashankmahajan.instaclone.R;
import com.instagramclone.shashankmahajan.instaclone.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by shashankmahajan on 24/02/18.
 */

public class LikeActivity extends AppCompatActivity {
    private static final String TAG = "Like Activty";
    private static final int Activity_Num = 3;

    private Context mContext = LikeActivity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG,"Oncreate : Started");

        setupBottomNavigation();
    }

    //BottomNavigationView setup
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
}
