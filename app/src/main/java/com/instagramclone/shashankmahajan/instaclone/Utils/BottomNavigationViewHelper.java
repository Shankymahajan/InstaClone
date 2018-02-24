package com.instagramclone.shashankmahajan.instaclone.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.instagramclone.shashankmahajan.instaclone.Home.HomeActivity;
import com.instagramclone.shashankmahajan.instaclone.Likes.LikeActivity;
import com.instagramclone.shashankmahajan.instaclone.Profile.ProfileActivity;
import com.instagramclone.shashankmahajan.instaclone.R;
import com.instagramclone.shashankmahajan.instaclone.Search.SearchActivity;
import com.instagramclone.shashankmahajan.instaclone.Share.ShareActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by shashankmahajan on 24/02/18.
 */

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";
    public static void setupBottomNavigationView (BottomNavigationViewEx bottomNavigationViewEx){

        Log.d(TAG,"setupBottomNavigatoinView: Setting up Navigation View");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }
    public static void enableNavigation(final Context context, BottomNavigationViewEx bottomNavigationViewEx){
        bottomNavigationViewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, HomeActivity.class);
                        context.startActivity(intent1); //Activity num 0
                        break;

                    case R.id.ic_search:
                        Intent intent2 = new Intent(context, SearchActivity.class);
                        context.startActivity(intent2); //Activity num 1
                        break;

                    case R.id.ic_circle:
                        Intent intent3 = new Intent(context, ShareActivity.class);
                        context.startActivity(intent3); //Activity num 2
                        break;

                    case R.id.ic_alert:
                        Intent intent4 = new Intent(context, LikeActivity.class);
                        context.startActivity(intent4); //Activity num 3
                        break;

                    case R.id.ic_android:
                        Intent intent5 = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent5); //Activity num 4
                        break;
                }

                return false;
            }
        });
    }
}
