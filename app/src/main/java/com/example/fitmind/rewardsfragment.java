package com.example.fitmind;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class rewardsfragment extends Fragment {
    // Required empty public constructor

    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<Goodie> data;
    private Button giftShopButton;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     */
    // TODO: Rename and change types and number of parameters
    public static rewardsfragment newInstance() {
        rewardsfragment fragment = new rewardsfragment();

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
        View view = inflater.inflate(R.layout.fragment_rewardsfragment, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.goodie_recycler_view);
        giftShopButton = (Button) view.findViewById(R.id.gift_shop_button);
        recyclerView.setHasFixedSize(true);

        giftShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), GiftShop.class);
                startActivity(intent);
            }
        });

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<>();
        data.add(new Goodie("free smoothie", "valid", 100));
        data.add(new Goodie("free tollie", "valid", 100));
        data.add(new Goodie("free toet", "redeemed", 100));

        adapter = new GoodieAdapter(data);
        recyclerView.setAdapter(adapter);
        return view;
}




}
