package com.example.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.R;

/**
 * Created by Dhandy on 5/9/2017.
 */

public class MainFragment extends FragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_articles);
    }
}