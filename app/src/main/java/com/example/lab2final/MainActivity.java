package com.example.lab2final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.Instant;


public class MainActivity extends AppCompatActivity {

    Button send_button;
    EditText send_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send_button= findViewById(R.id.sendButton);
        send_text= findViewById(R.id.personName);

        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = send_text.getText().toString();
                Intent intent = new Intent(getApplicationContext(),secoendActivity.class);
                intent.putExtra("PersonName" , s);
                startActivity(intent);


            }
        });
    }
}