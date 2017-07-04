package com.example.fitmind;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.fitmind.R.id.points;


public class homefragment extends Fragment {

    ListView list;
    LazyAdapter adapter;
    ArrayList<HomeScreen> homeScreens;

    // TODO: Rename and change types and number of parameters
    public static homefragment newInstance() {
        homefragment fragment = new homefragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_homefragment, container, false);
        homeScreens = new ArrayList<>();
        homeScreens.add(new HomeScreen("Quiz","General Knowledge", "50 points", R.drawable.test));
        homeScreens.add(new HomeScreen("Exam Prep","Mathematics", "100 points", R.drawable.exam));
        homeScreens.add(new HomeScreen("Check-in", "GradHack presentation", "200 points", R.drawable.map));

        list=(ListView)view.findViewById(R.id.list);
        adapter=new LazyAdapter(getActivity(), homeScreens);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView parent, View view,
                                    int position, long id) {
                if (position == 1){
                    Intent intent = new Intent(getActivity(), QuizActivity.class);
                    startActivity(intent);
                }
                else if (position == 2){
//                    Intent intent = new Intent(getActivity(), CheckInActivity.class);
//                    startActivity(intent);
                }
            }
        });
        return view;
    }


}
