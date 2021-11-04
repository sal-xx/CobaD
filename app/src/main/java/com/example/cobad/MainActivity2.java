package com.example.cobad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button cekButton = (Button) findViewById(R.id.cek);
        cekButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Tinggi = (EditText) findViewById(R.id.tgi);
                EditText Berat = (EditText) findViewById(R.id.brt);
                String TgStr = Tinggi.getText().toString();
                String BrStr = Berat.getText().toString();
                Intent ThrIntent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(ThrIntent);
            }
        });
    }
}