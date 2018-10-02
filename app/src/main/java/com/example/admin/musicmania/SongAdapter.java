package com.example.admin.musicmania;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<song> {

    public SongAdapter(Activity mainActivity, ArrayList<song> words) {
        super(mainActivity, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        song currentSong = getItem(position);

        TextView nameTextView =  listItemView.findViewById(R.id.songName);
        nameTextView.setText(currentSong.getmSong());
        TextView albumTextView =  listItemView.findViewById(R.id.albumName);
        albumTextView.setText(currentSong.getmAlbum());
        return listItemView;
    }

}
