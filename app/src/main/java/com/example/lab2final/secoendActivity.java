package com.example.lab2final;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class secoendActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secoend);


        Intent i = getIntent();
        String s = i.getStringExtra("PersonName");

        TextView tv = (TextView) findViewById(R.id.recevied_value);
        // tv.setText("Hello"+s+"!");
        tv.setText("Hello, " + s + "!");
    }
}