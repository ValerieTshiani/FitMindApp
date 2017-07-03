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
import org.w3c.dom.Text;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class reportAdapter extends RecyclerView.Adapter<reportAdapter.MyViewHolder> {

    private ArrayList<report> reportList;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        public CardView mCardView;
        public TextView mTextView;

        public TextView report_name, reportInfo;
        public ImageView report_cover;

        public MyViewHolder(View v) {
            super(v);
            this.mCardView = (CardView) v.findViewById(R.id.card_view_reporting);
            this.report_name = (TextView) v.findViewById(R.id.report_name);
            //this.reportInfo = (TextView) v.findViewById(R.id.reportInfo);

            //this.year = (TextView) v.findViewById(R.id.year);
            this.report_cover = (ImageView) v.findViewById(R.id.report_cover);
        }
    }

    public reportAdapter(ArrayList<report> reportList){
        this.reportList = reportList;
    }

    @Override
    public  MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Creating a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.reporting_items,parent,false);

        //set the view's size, margins, paddings and layout parameters

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        // - get element from arraylist at this position
        // - replace the contents of the view with that element

        report report = reportList.get(position);
        holder.report_name.setText(report.getReportName());
        //holder.reportInfo.setText(report.getReport_info());
        // holder.year.setText(subject.getYear());
        holder.report_cover.setImageResource(report.getPic());
        //holder.year.setText("2017");

    }

    @Override
    public int getItemCount() {
        return reportList.size();
    }

}