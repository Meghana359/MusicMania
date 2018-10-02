package com.example.admin.musicmania;

public class Song {
    private String mSong;
    private String mAlbum;

    public Song(String song, String album) {
        mSong = song;
        mAlbum = album;
    }

    public String getmAlbum() {
        return mAlbum;
    }

    public String getmSong() {
        return mSong;
    }
}
