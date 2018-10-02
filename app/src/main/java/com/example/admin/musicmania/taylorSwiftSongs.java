package com.example.admin.musicmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class taylorSwiftSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        final ArrayList<song> track = new ArrayList<>();

        track.add(new song("Love story", "Fearless"));
        track.add(new song("Blank space", "1989"));
        track.add(new song("Gorgeous", "Reputation"));
        track.add(new song("Shake it off", "1989"));
        track.add(new song("Bad blood", "1989"));
        track.add(new song("Back to december", "Speak Now"));
        track.add(new song("Style", "1989"));
        track.add(new song("Delicate", "Reputation"));
        track.add(new song("22", "Red"));
        track.add(new song("Out of the woods", "1989"));
        track.add(new song("Mean", "Speak Now"));
        track.add(new song("Mine", "Speak Now"));

        SongAdapter itemsAdapter = new SongAdapter(this, track);

        ListView listView =  findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), currentSong.class);
                switch (i) {
                    case 0:
                        intent.putExtra("Title", track.get(i).getmSong());
                        break;
                    case 1:
                        intent.putExtra("Title", track.get(i).getmSong());
                        break;
                    case 2:
                        intent.putExtra("Title", track.get(i).getmSong());
                        break;
                    case 3:
                        intent.putExtra("Title", track.get(i).getmSong());
                        break;
                    case 4:
                        intent.putExtra("Title", track.get(i).getmSong());
                        break;
                    case 5:
                        intent.putExtra("Title", track.get(i).getmSong());
                        break;
                    case 6:
                        intent.putExtra("Title", track.get(i).getmSong());
                        break;
                    case 7:
                        intent.putExtra("Title", track.get(i).getmSong());
                        break;
                    case 8:
                        intent.putExtra("Title", track.get(i).getmSong());
                        break;
                    case 9:
                        intent.putExtra("Title", track.get(i).getmSong());
                        break;
                    case 10:
                        intent.putExtra("Title", track.get(i).getmSong());
                        break;
                    case 11:
                        intent.putExtra("Title", track.get(i).getmSong());
                        break;
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


