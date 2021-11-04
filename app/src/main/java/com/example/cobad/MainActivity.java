package com.example.cobad;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri; import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button Next1Button = (Button) findViewById(R.id.next1);
        Next1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Name = (EditText) findViewById(R.id.nama);
                EditText Email = (EditText) findViewById(R.id.email);
                String NameStr = Name.getText().toString();
                String EmailStr = Email.getText().toString();
                Intent FirstIntent = new Intent(MainActivity.this, CobaRelative.class);
                startActivity(FirstIntent);
            }
        });
    }
}