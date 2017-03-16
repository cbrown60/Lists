package com.codeclan.topalbumlists;

import java.util.ArrayList;


public class TopAlbums {

    private ArrayList<Album> list;

    public TopAlbums(){
        list = new ArrayList<Album>();
        list.add(new Album(1, "Divide", "Ed Sheeran"));
        list.add(new Album(1, "Human", "Rag n Bone Man"));
        list.add(new Album(1, "X", "Ed Sheeran"));
        list.add(new Album(1, "Gang Signs & Player", "Stormzy"));
        list.add(new Album(1, "+", "Ed Sheeran"));


    }

    public ArrayList<Album>getList(){
        return new ArrayList<Album>(list);
    }
}
