package com.example.admin.musicmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class marron5Songs extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        final ArrayList<song> track = new ArrayList<>();
        track.add(new song("Girls like you","Red Pill Blues"));
        track.add(new song("Sugar","V"));
        track.add(new song("Animals","V"));
        track.add(new song("Moves like jagger","Hands All Over"));
        track.add(new song("Maps","V"));
        track.add(new song("Wait","Red Pill Blues"));
        track.add(new song("Sunday morning","Songs about Jane"));
        track.add(new song("Misery","Hands All Over"));
        track.add(new song("One more night","Overexposed"));
        track.add(new song("Payphone","Overexposed"));
        track.add(new song("What lovers do","Red Pill Blues"));
        track.add(new song("She will be loved","Songs about Jane"));

        SongAdapter itemsAdapter = new SongAdapter(this, track);
        ListView listView = (ListView) findViewById(R.id.list);
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
                intent.putExtra("Image", 2);
                startActivity(intent);
            }
        });
    }
}
