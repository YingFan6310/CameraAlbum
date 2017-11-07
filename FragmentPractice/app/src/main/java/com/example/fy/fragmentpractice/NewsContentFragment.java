package com.example.fy.fragmentpractice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by fy on 2017/10/28.
 */

public class NewsContentFragment extends Fragment {
    private View view;
    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.news_content_frag,container,false);
        return view;
    }
    public void refresh(String newsTitle,String newsContent){
        View visibiityLayout=view.findViewById(R.id.visibility_layout);
        visibiityLayout.setVisibility(View.VISIBLE);
        TextView newsTitleText=(TextView) view.findViewById(R.id.news_title);
        TextView newsContentText=(TextView) view.findViewById(R.id.news_content);
        newsContentText.setText(newsContent);
        newsTitleText.setText(newsTitle);

    }

}
