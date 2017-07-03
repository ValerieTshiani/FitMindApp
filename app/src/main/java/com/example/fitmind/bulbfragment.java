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

public class bulbfragment extends Fragment {

    public static subjectAdapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private static RecyclerView recycleView;

    private ArrayList<subject> subjectList;



    //private ArrayList<subject> subjectList;
    private subjectAdapter subjectAdapter;

    public static bulbfragment newInstance() {
        bulbfragment fragment = new bulbfragment();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    String[] subjectNames = {"BIO","Math","English","French"};
    String[] subjectInfo = {"Birds and the bees ","Numbers","Books","All about language"};
    int [] pics = {R.drawable.ic_bio,  R.drawable.ic_maths, R.drawable.ic_book,  R.drawable.ic_languages };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_bulbfragment, container, false);
        recycleView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recycleView.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recycleView.setLayoutManager(gridLayoutManager);
        recycleView.setItemAnimator (new DefaultItemAnimator());


        //intializing an arraylist called subjectList
        subjectList = new ArrayList<>();
        subjectList.add(new subject("Bio","Birds and the bees",R.drawable.biology));
        subjectList.add(new subject("Maths","Numbers and Equations",R.drawable.maths));
        subjectList.add(new subject("English","Literature and grammar",R.drawable.english));
        subjectList.add(new subject("Chemistry","equations and organic chemistry",R.drawable.chemistry));
        subjectList.add(new subject("History","Learning from past events",R.drawable.history));
        subjectList.add(new subject("Business Studies","The business world",R.drawable.business_studies));
        subjectList.add(new subject("Geography","People and their environments",R.drawable.geography));
        subjectList.add(new subject("Accounting","Fianances transactions",R.drawable.accounting));

        adapter = new subjectAdapter(subjectList);
        recycleView.setAdapter(adapter);


      /*  mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "Card at " + position + " is clicked", Toast.LENGTH_SHORT).show();
            }
        })); */

//        recycleView.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity(), "Click pressed",Toast.LENGTH_SHORT).show();
//            }
//
//        });

        recycleView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View v, int position) {

                        Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getActivity(), BioStatsActivity.class);
                    }
                })
        );

        return view;



    }


}
