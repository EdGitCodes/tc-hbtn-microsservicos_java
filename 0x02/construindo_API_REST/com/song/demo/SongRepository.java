package com.song.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {

    private List<Song> list = new ArrayList<Song>();

    public List<Song> getAllSongs() {
        return list;
    }

    public void addSong(Song song) {
        list.add(song);
    }

    public void updateSong(Song son) {
        for (Song song : list) {
            if (son.getId().equals(song.getId())) {
                list.set(list.indexOf(song), son);
            }
        }
    }

    public Song getSongById(Integer id) {
        for(Song song : list){
            if(id.equals(song.getId())){
                return song;
            }
        }
        return null;
    }

    public void removeSong(Song song) {
        list.remove(song);
    }

}