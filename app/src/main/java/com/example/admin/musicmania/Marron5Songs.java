package com.example.admin.musicmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Marron5Songs extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<Song> track = new ArrayList<>();
        track.add(new Song("Girls like you", "Red Pill Blues"));
        track.add(new Song("Sugar", "V"));
        track.add(new Song("Animals", "V"));
        track.add(new Song("Moves like jagger", "Hands All Over"));
        track.add(new Song("Maps", "V"));
        track.add(new Song("Wait", "Red Pill Blues"));
        track.add(new Song("Sunday morning", "Songs about Jane"));
        track.add(new Song("Misery", "Hands All Over"));
        track.add(new Song("One more night", "Overexposed"));
        track.add(new Song("Payphone", "Overexposed"));
        track.add(new Song("What lovers do", "Red Pill Blues"));
        track.add(new Song("She will be loved", "Songs about Jane"));

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
                intent.putExtra("Image", 2);
                startActivity(intent);
            }
        });
    }
}
