package com.example.musicServer.components.songs;

import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

enum Genre{ROCK, POP, RAP, CLASSICAL }

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "songs")
@Setter
public class Song {
    @Id
    private String id;
    private String title;
    private String artist;
    private Genre genre;
    private int length;
    private float price;



    

    // public SongModel(int id,String title,String artist,Genre g,int len,float price){
    //     this.id=id;
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //     this.artist=artist;
    //     this.genre=g;
    //     this.price=price;
    // }
    // public int getId(){
    //     return id;
    // }
    // public void setId(int id){
    //     this.id=id;
    // }
    
    // public String GetTitle(){
    //     return title;
    // }
    // public void SetTitle(String s){
    //   title=s;
    // }
    // public String getArtist(){
    //     return artist;
    // }
    // public void setArtist(String a){
    //     this.artist=a;
    // }
    // public float getPrice(){
    //     return price;
    // }
    // public void setPrice(float p){
    //     price=p;
    // }
    // public Genre getGenre(){
    //     return genre;
    // }
    // public void setGenre(Genre a){
    //     this.genre=a;
    // }
    // @Override
    // public String toString() {
    //    String s=id+" "+artist+" "+genre+" ";
    //     return s;
    // }
    
    

}
