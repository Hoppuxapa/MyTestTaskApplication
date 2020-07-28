package com.example.mytesttaskapplication;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 Button here;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        here = (Button) findViewById(R.id.line1);
        here.setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View view) {
        Random random = new Random();
        int i = random.nextInt();
        view.setBackgroundColor(i);

    }
}
