package com.example.mytesttaskapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = (ConstraintLayout) findViewById(R.id.here);
        constraintLayout.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View view) {
        Random random = new Random();
        int i = random.nextInt();
        view.setBackgroundColor(i);



    }
}
