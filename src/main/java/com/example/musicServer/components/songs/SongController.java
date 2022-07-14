package com.example.musicServer.components.songs;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("songs")

public class SongController {
    
    @Autowired
    private SongService s;

    @GetMapping("")
    public List<Song> getAllSongs(){
       return s.getSongs();
    }
    
    @GetMapping("/{id}")
    public Song getSpecificSong(@PathVariable String id){
        return s.getSongById(id);
    }
    @GetMapping("/byArtistName/{name}")
    public List<Song> getSpecificSongs(@PathVariable String name){
        return s.getSongsByArtist(name);
    }
    @PutMapping("")
    public Song updateSong(@RequestBody Song newSong) {
       return s.updateSong(newSong);
    }    
    @PostMapping("")
    public Song add(@RequestBody Song song) {return s.addSong(song);}
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
         s.deleteSongById(id);
    }

}


