package com.example.fitmind;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
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

public class BioStatsActivity extends AppCompatActivity {

    public static reportAdapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static RecyclerView recycleView;
    private reportAdapter reportAdapter;
    //private ArrayList<report> reportList;
    private ArrayList<report> reportList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_stats);

        recycleView = (RecyclerView) findViewById(R.id.recycler_view_reporting);
        recycleView.setHasFixedSize(true);
        //reportAdapter = new reportAdapter(reportList);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recycleView.setLayoutManager(gridLayoutManager);
        recycleView.setItemAnimator (new DefaultItemAnimator());

        //intializing an arraylist called subjectList
        reportList = new ArrayList<>();
        reportList.add(new report("# of quizzes taken",R.drawable.ten));
        reportList.add(new report("Quizzies Passed",R.drawable.six));
        //reportList.add(new report("Strengths",R.drawable.weakness));
       // reportList.add(new report("Weaknesses",R.drawable.strength));



        //reportAdapter = new reportAdapter(reportList);
        reportAdapter = new reportAdapter(reportList);
        recycleView.setAdapter(reportAdapter);



    }

}
