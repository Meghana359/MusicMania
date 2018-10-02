package com.example.admin.musicmania;

public class song {
    private String mSong;
    private String mAlbum;

    public song(String song,String album) {
        mSong = song;
        mAlbum=album;
    }
    public String getmAlbum(){return mAlbum;}

    public String getmSong() {
        return mSong;
    }
}
