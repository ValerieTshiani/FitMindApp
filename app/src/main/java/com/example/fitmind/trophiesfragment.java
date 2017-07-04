package com.example.fitmind;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;



public class trophiesfragment extends Fragment {

    public static trophyAdapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static RecyclerView recycleView;
    private ArrayList<trophies> trophyList;

    private trophyAdapter trophyAdapter;

    public static trophiesfragment newInstance() {
        trophiesfragment fragment = new trophiesfragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_trophiesfragment, container, false);
        recycleView = (RecyclerView) view.findViewById(R.id.recycler_view_trophies);
        recycleView.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        recycleView.setLayoutManager(gridLayoutManager);
        recycleView.setItemAnimator (new DefaultItemAnimator());

        trophyList = new ArrayList<>();
        trophyList.add(new trophies(R.drawable.competition));
        trophyList.add(new trophies(R.drawable.fire));
        trophyList.add(new trophies(R.drawable.einstein));
        trophyList.add(new trophies(R.drawable.atomic));
        trophyList.add(new trophies(R.drawable.padlockoff));
        trophyList.add(new trophies(R.drawable.padlockoff));
        trophyList.add(new trophies(R.drawable.padlockoff));
        trophyList.add(new trophies(R.drawable.padlockoff));
        trophyList.add(new trophies(R.drawable.padlockoff));

        adapter = new trophyAdapter(trophyList);
        recycleView.setAdapter(adapter);

        recycleView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View v, int position) {

                        // Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();

                        switch (position)
                        {
                            case 0:
                                Toast.makeText(getActivity(), "Competition Winner" + position, Toast.LENGTH_SHORT).show();
                                break;
                            case 1:
                                Toast.makeText(getActivity(), "Fire Winner" + position, Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                Toast.makeText(getActivity(), "einstein Winner" + position, Toast.LENGTH_SHORT).show();
                                break;
                            case 3:
                                Toast.makeText(getActivity(), "Completed all Physics quizzes" + position, Toast.LENGTH_SHORT).show();
                                break;
                            case 4:
                                Toast.makeText(getActivity(), "Trophy not unlocked" + position, Toast.LENGTH_SHORT).show();
                                break;
                            case 5:
                                Toast.makeText(getActivity(), "Trophy not unlocked" + position, Toast.LENGTH_SHORT).show();
                                break;
                            case 6:
                                Toast.makeText(getActivity(), "Trophy not unlocked" + position, Toast.LENGTH_SHORT).show();
                                break;
                            case 7:
                                Toast.makeText(getActivity(), "Trophy not unlocked" + position, Toast.LENGTH_SHORT).show();
                                break;

                        }

                    }
                })
        );

        return view;
    }


}
