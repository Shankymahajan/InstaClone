package com.instagramclone.shashankmahajan.instaclone.Home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.instagramclone.shashankmahajan.instaclone.R;

/**
 * Created by shashankmahajan on 24/02/18.
 */

public class HomeFragment extends Fragment {
    private static final String TAG= "Home Fragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,container,false);
        return view;
    }
}
