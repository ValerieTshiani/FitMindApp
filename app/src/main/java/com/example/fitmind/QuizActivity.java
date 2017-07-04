package com.example.fitmind;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Shuaib on 2017-07-04.
 */

public class QuizActivity extends AppCompatActivity{

    Button button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        button = (Button)findViewById(R.id.button_Submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Congratulation_screen.class);
                startActivity(intent);
            }
        });
    }
}
