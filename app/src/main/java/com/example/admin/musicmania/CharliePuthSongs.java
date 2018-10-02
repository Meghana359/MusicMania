package com.example.admin.musicmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CharliePuthSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<Song> track = new ArrayList<>();
        track.add(new Song("Attention", "Voice Notes"));
        track.add(new Song("How Long", "How Long"));
        track.add(new Song("We don't talk anymore", "Nine Track Mind"));
        track.add(new Song("One Call away", "Nine Track Mind"));
        track.add(new Song("Dangerously", "Nine Track Mind"));
        track.add(new Song("If you leave me now", "Voice Notes"));
        track.add(new Song("LA girls", "Voice Notes"));
        track.add(new Song("Done for me", "voice Notes"));
        track.add(new Song("The way I am", "Voice Notes"));
        track.add(new Song("Marvin gaye", "Some Type of Love"));
        track.add(new Song("Boy", "Voice Notes"));
        track.add(new Song("Look at me Now", "Ego"));

        SongAdapter itemsAdapter = new SongAdapter(this, track);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), CurrentSong.class);
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        intent.putExtra("Title", track.get(i).getmSong());
                        break;
                    default:
                        intent.putExtra("Title", "Song is missing.");
                        break;
                }
                intent.putExtra("Image", 1);
                startActivity(intent);
            }
        });
    }
}


