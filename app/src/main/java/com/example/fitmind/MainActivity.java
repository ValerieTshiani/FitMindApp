package com.example.fitmind;

import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.support.annotation.NonNull;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){


            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item){
                Fragment selectedFragment = null;
                switch (item.getItemId())
                {
                    case R.id.action_home :
                        //Toast.makeText(MainActivity.this, "Action Home Clicked", Toast.LENGTH_SHORT).show();
                        selectedFragment = homefragment.newInstance();
                        break;
                    case R.id.action_lightbulb :
                        // Toast.makeText(MainActivity.this, "Action LightBulb Clicked", Toast.LENGTH_SHORT).show();
                        selectedFragment = bulbfragment.newInstance();
                        break;
                    case R.id.action_trophy :
                        //Toast.makeText(MainActivity.this, "Action trophy Clicked", Toast.LENGTH_SHORT).show();
                        selectedFragment = trophiesfragment.newInstance();
                        break;
                    case R.id.action_gift :
                        //Toast.makeText(MainActivity.this, "Action gift Clicked", Toast.LENGTH_SHORT).show();
                        selectedFragment = rewardsfragment.newInstance();
                        break;
                    case R.id.action_profile :
                        //Toast.makeText(MainActivity.this, "Action profile Clicked", Toast.LENGTH_SHORT).show();
                        selectedFragment = profilefragment.newInstance();
                        break;

                }
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, selectedFragment);
                transaction.commit();
                return true;
            }


        });

        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, homefragment.newInstance());
        transaction.commit();
    }
}
