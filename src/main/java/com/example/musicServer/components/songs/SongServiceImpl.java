package com.example.musicServer.components.songs;


import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SongServiceImpl implements SongService {

    @Autowired
    private final SongRepository repository;

    @Override
    public Song addSong(Song s) {
       return repository.save(s);
    }

    @Override
    public List<Song> getSongs() {
        return repository.findAll();
    }

    @Override
    public Song getSongById(String id) {
        return repository.findById(id);
    }

    @Override
    public void deleteSongById(String id) {
       repository.deleteById(id);
    }

    @Override
    public Song updateSong(Song s) {
        return repository.save(s);
    }

    @Override
    public List<Song> getSongsByArtist(String artist) {
        return repository.findByArtist(artist);
    }

}
