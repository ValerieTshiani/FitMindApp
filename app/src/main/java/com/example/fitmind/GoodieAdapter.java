package com.example.fitmind;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Shuaib on 2017-07-01.
 */

public class GoodieAdapter extends RecyclerView.Adapter<GoodieAdapter.MyViewHolder> {
    private ArrayList<Goodie> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle;
        TextView textViewRedeemedStatus;
        ImageView imageViewIcon;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewTitle = (TextView) itemView.findViewById(R.id.textViewTitle);
            this.textViewRedeemedStatus = (TextView) itemView.findViewById(R.id.textViewRedeemedStatus);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.thumbnail);
        }
    }
    public GoodieAdapter(ArrayList<Goodie> data){
         this.dataSet = data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_goodies_layout, parent, false);

       // view.setOnClickListener(MainActivity.myOnClickListener);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewTitle = holder.textViewTitle;
        TextView textViewRedeemedStatus = holder.textViewRedeemedStatus;
        ImageView imageView = holder.imageViewIcon;

        textViewTitle.setText(dataSet.get(listPosition).getCategory());
        textViewRedeemedStatus.setText(dataSet.get(listPosition).getDescription());
        imageView.setImageResource(R.drawable.kauaimin);
        Picasso.with(holder.itemView.getContext()).load(R.drawable.kauaimin).into(imageView);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

}
