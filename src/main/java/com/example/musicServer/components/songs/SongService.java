package com.example.musicServer.components.songs;

import java.util.List;

import org.springframework.stereotype.Service;


public interface SongService {
    Song addSong(Song s);
    List<Song> getSongs();
    Song getSongById(String id) ;
    void deleteSongById(String id);
    Song updateSong( Song s);
    List<Song> getSongsByArtist(String a);
}
