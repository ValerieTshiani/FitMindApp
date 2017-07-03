package com.example.fitmind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class GiftShop extends AppCompatActivity {

    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<Goodie> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift_shop);

        recyclerView = (RecyclerView) findViewById(R.id.gift_shop_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<>();
        data.add(new Goodie("free smoothie", "valid", 100, R.drawable.kauaimin));
        data.add(new Goodie("free tollie", "valid", 100, R.drawable.sterkinekormin));
        data.add(new Goodie("free toet", "redeemed", 100, R.drawable.kauaimin));

        adapter = new GoodieAdapter(data);
        recyclerView.setAdapter(adapter);
    }
}
