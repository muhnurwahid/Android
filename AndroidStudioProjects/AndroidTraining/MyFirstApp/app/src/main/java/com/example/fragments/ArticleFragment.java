package com.example.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.R;

/**
 * Created by Dhandy on 5/9/2017.
 */

public class ArticleFragment extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        return inflater.inflate(R.layout.article_view,container,false);
    }
}
