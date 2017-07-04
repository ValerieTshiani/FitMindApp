package com.example.fitmind;

/**
 * Created by Valerie_Tshiani on 03-Jul-17.
 */
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class trophyAdapter extends RecyclerView.Adapter<trophyAdapter.MyViewHolder> {

    private ArrayList<trophies> trophyList;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle;
        public CardView mCardView;
        public TextView mTextView;

        public ImageView trophy_cover;

        public MyViewHolder(View v) {
            super(v);
            this.mCardView = (CardView) v.findViewById(R.id.card_view_trophy);
            //this._trophy_name = (TextView) v.findViewById(R.id.trophy_name);
            this.trophy_cover = (ImageView) v.findViewById(R.id.trophy_cover);
        }

    }
    public trophyAdapter(ArrayList<trophies> trophyList){
        this.trophyList = trophyList;
    }
    @Override
    public  MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Creating a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.trophy,parent,false);

        //set the view's size, margins, paddings and layout parameters

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        // - get element from arraylist at this position
        // - replace the contents of the view with that element

        trophies trophies  = trophyList.get(position);



        holder.trophy_cover.setImageResource(trophies.getPic());

    }


    @Override
    public int getItemCount() {
        return trophyList.size();
    }
}
