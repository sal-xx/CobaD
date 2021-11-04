package com.example.cobad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CobaRelative extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        final Button Next2Button = (Button) findViewById(R.id.next2);
        Next2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Tgl = (EditText) findViewById(R.id.tgl);
                String TglStr = Tgl.getText().toString();
                Intent SecIntent = new Intent(CobaRelative.this, MainActivity2.class);
                startActivity(SecIntent);
            }
        });
    }
}