package com.codeclan.topalbumlists;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TopAlbumsAdapter extends ArrayAdapter<Album> {

    public TopAlbumsAdapter(Context context, ArrayList<Album>albums){

        super(context, 0, albums);
    }

    @Override
   public View getView(int position, View convertView, ViewGroup parent){
       View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_top_albums, parent,false);
        }

        Album currentAlbum = getItem(position);

        TextView ranking =(TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentAlbum.getRanking().toString());

        TextView title =(TextView) listItemView.findViewById(R.id.title);
        title.setText(currentAlbum.getTitle());

        TextView artist =(TextView) listItemView.findViewById(R.id.artist);
        artist.setText(currentAlbum.getArtist());

        return listItemView;

    }



}
