package com.example.fitmind;

import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Shuaib on 2017-07-01.
 */

public class GiftShopAdapter extends RecyclerView.Adapter<GiftShopAdapter.MyViewHolder> {
    private ArrayList<Goodie> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle;
        TextView textViewRedeemedStatus;
        ImageView imageViewIcon;
        TextView textViewPoints;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewTitle = (TextView) itemView.findViewById(R.id.textViewTitle);
            this.textViewRedeemedStatus = (TextView) itemView.findViewById(R.id.textViewRedeemedStatus);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.thumbnail);
            this.textViewPoints = (TextView) itemView.findViewById(R.id.points);
        }
    }
    public GiftShopAdapter(ArrayList<Goodie> data){
        this.dataSet = data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_gift_shop, parent, false);

        // view.setOnClickListener(MainActivity.myOnClickListener);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewTitle = holder.textViewTitle;
        TextView textViewRedeemedStatus = holder.textViewRedeemedStatus;
        ImageView imageView = holder.imageViewIcon;
        TextView textViewPoints = holder.textViewPoints;

        textViewTitle.setText(dataSet.get(listPosition).getCategory());
        textViewRedeemedStatus.setText(dataSet.get(listPosition).getDescription());
        imageView.setImageResource(dataSet.get(listPosition).getGoodieId());
        textViewPoints.setText(dataSet.get(listPosition).getPointsNeeded());
        Picasso.with(holder.itemView.getContext()).load(R.drawable.kauaimin).into(imageView);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
