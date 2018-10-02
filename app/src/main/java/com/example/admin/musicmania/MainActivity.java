package com.example.admin.musicmania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout charlie = findViewById(R.id.charlie);
        LinearLayout maroon = findViewById(R.id.maroon);
        LinearLayout taylor = findViewById(R.id.taylor);
        charlie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), charliePuthSongs.class);
                startActivity(intent);
            }
        });
        maroon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), marron5Songs.class);
                startActivity(intent);
            }
        });
        taylor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), taylorSwiftSongs.class);
                startActivity(intent);
            }
        });
    }
}
