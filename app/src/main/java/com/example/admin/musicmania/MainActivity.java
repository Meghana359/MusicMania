package com.example.admin.musicmania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout charlie = findViewById(R.id.charlie);
        charlie.setOnClickListener(this);
        LinearLayout maroon = findViewById(R.id.maroon);
        maroon.setOnClickListener(this);
        LinearLayout taylor = findViewById(R.id.taylor);
        taylor.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.charlie:
                Intent intent = new Intent(getApplicationContext(), CharliePuthSongs.class);
                startActivity(intent);
                break;
            case R.id.maroon:
                intent = new Intent(getApplicationContext(), Marron5Songs.class);
                startActivity(intent);
            case R.id.taylor:
                intent = new Intent(getApplicationContext(), TaylorSwiftSongs.class);
                startActivity(intent);
        }
    }
}
