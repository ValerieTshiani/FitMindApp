package com.example.fitmind;

/**
 * Created by TSHVAL003 on 2017/07/01.
 */

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;
public class subjectAdapter extends RecyclerView.Adapter<subjectAdapter.MyViewHolder> {

    private ArrayList<subject> subjectList;

    public static class MyViewHolder  extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        public CardView mCardView;
        public TextView mTextView;

        public TextView subject_name, subjectInfo, year;
        public ImageView sujbect_cover;


        public MyViewHolder(View v) {
            super(v);
            this.mCardView = (CardView) v.findViewById(R.id.card_view);
            this.subject_name = (TextView) v.findViewById(R.id.subject_name);
            this.subjectInfo = (TextView) v.findViewById(R.id.subjectInfo);

            this.year = (TextView) v.findViewById(R.id.year);
            this.sujbect_cover = (ImageView) v.findViewById(R.id.sujbect_cover);

        }

    }

    public subjectAdapter(ArrayList<subject> subjectList){
        this.subjectList = subjectList;
    }



    //Create new views (invoked by the layout manager)
    @Override
    public  MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Creating a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.subject_list,parent,false);

        //set the view's size, margins, paddings and layout parameters

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    //Replace the contents of a view (invoked by the layout manager
    //Might need to change this one
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        // - get element from arraylist at this position
        // - replace the contents of the view with that element

        subject subject = subjectList.get(position);
        holder.subject_name.setText(subject.getSubjectName());
        holder.subjectInfo.setText(subject.getSubject_info());
        holder.year.setText(subject.getYear());
        holder.sujbect_cover.setImageResource(subject.getPic());
        holder.year.setText("2017");

    }

    @Override
    public int getItemCount() {
        return subjectList.size();
    }

}
