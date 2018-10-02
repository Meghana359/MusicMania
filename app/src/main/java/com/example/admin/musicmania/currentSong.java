package com.example.admin.musicmania;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class currentSong extends AppCompatActivity {
    boolean flag = true;
    String songName;
    int image_no = 0;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("STRING_SONG_NAME", songName);
        outState.putSerializable("STRING_IMAGE_NO", image_no);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                songName = null;
                image_no = 0;
            } else {
                songName = extras.getString("Title");
                image_no = extras.getInt("Image");
            }
        } else {
            songName = (String) savedInstanceState.getSerializable("STRING_SONG");
            image_no = (int) savedInstanceState.getSerializable("STRING_IMAGE_NO");
        }
        TextView name = findViewById(R.id.name1);
        name.setText(songName);

        ImageView image = findViewById(R.id.image1);
        switch (image_no) {
            case 1:
                image.setImageResource(R.drawable.charlie);
                break;
            case 2:
                image.setImageResource(R.drawable.maroon);
                break;
            case 3:
                image.setImageResource(R.drawable.talyor);
                break;
            default:
                Log.v("no image", songName);
                break;
        }
        final ImageView playButton = findViewById(R.id.playSong);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    playButton.setImageResource(R.drawable.pause_image);
                    flag = false;
                } else {
                    playButton.setImageResource(R.drawable.play_image);
                    flag = true;
                }
            }
        });
    }
}
