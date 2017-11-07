package com.example.fy.fragmentpractice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by fy on 2017/10/28.
 */

public class NewsTitleFragmwnt extends Fragment {
    private boolean isTowPane;
    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.news_title_frag,container,false);
        return view;
    }
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        if(getActivity().findViewById(R.id.news_content)!=null){
            isTowPane=true;
        }
        else {
            isTowPane=false;
        }

    }
}
