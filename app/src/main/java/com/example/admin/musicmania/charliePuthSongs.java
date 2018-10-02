package com.example.admin.musicmania;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class charliePuthSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        final ArrayList<song> track = new ArrayList<>();

        track.add(new song("Attention","Voice Notes"));
        track.add(new song("How Long","How Long"));
        track.add(new song("We don't talk anymore","Nine Track Mind"));
        track.add(new song("One Call away","Nine Track Mind"));
        track.add(new song("Dangerously","Nine Track Mind"));
        track.add(new song("If you leave me now","Voice Notes"));
        track.add(new song("LA girls","Voice Notes"));
        track.add(new song("Done for me","voice Notes"));
        track.add(new song("The way I am","Voice Notes"));
        track.add(new song("Marvin gaye","Some Type of Love"));
        track.add(new song("Boy","Voice Notes"));
        track.add(new song("Look at me Now","Ego"));

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
                intent.putExtra("Image", 1);
                startActivity(intent);
            }
        });
    }
}


