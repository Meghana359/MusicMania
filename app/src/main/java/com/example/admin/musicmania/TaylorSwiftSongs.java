package com.example.admin.musicmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TaylorSwiftSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<Song> track = new ArrayList<>();

        track.add(new Song("Love story", "Fearless"));
        track.add(new Song("Blank space", "1989"));
        track.add(new Song("Gorgeous", "Reputation"));
        track.add(new Song("Shake it off", "1989"));
        track.add(new Song("Bad blood", "1989"));
        track.add(new Song("Back to december", "Speak Now"));
        track.add(new Song("Style", "1989"));
        track.add(new Song("Delicate", "Reputation"));
        track.add(new Song("22", "Red"));
        track.add(new Song("Out of the woods", "1989"));
        track.add(new Song("Mean", "Speak Now"));
        track.add(new Song("Mine", "Speak Now"));

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
                intent.putExtra("Image", 3);
                startActivity(intent);
            }
        });
    }
}


