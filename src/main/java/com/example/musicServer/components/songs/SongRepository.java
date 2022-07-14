package com.example.musicServer.components.songs;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface SongRepository extends MongoRepository<Song,Integer>{
    List<Song> findByArtist(String artist);
    Song findById(String s);
    void deleteById(String s);
}




// import java.util.ArrayList;
// import java.util.List;

// public class SongRepository  {
//     private List<SongModel>  songList=new ArrayList<>();

//     public void addSong(SongModel s){
//         songList.add(s);
//         System.out.println("add song");
//     }
//     public List<SongModel> getAllSongs(){
//         System.out.println("get song");
//         return songList;
//     }
//     public SongModel getSongById(int id){
//         System.out.println("get song By Id");
//         for (SongModel s : songList) {
//             if(s.getId()==id)
//               return s;
//         }
//         return null;
//     }
//     public SongModel deleteSongById(int id){
//         System.out.println("delete song By Id");
//         for (SongModel s : songList) {
//             if(s.getId()==id){
//               songList.remove(s);
//               return s;}
//         }
//         return null;
//     }
//     public List<SongModel> getSongsByArtist(String a){
//         System.out.println("get song By artist");
//         List<SongModel> temp=new ArrayList<>();
//         for (SongModel s : songList) {
//             if(s.getArtist().equals(a))
//              {System.out.println(s.toString());
//               temp.add(s);}
//         }
//         return temp;
//     }




// }
