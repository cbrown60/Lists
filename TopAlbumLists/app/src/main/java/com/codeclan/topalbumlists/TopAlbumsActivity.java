package com.codeclan.topalbumlists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TopAlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_albums_adapter);

        TopAlbums topAlbums = new TopAlbums();
        ArrayList<Album> list = topAlbums.getList();

        TopAlbumsAdapter albumsAdapter = new TopAlbumsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(albumsAdapter);

    }

    public void titleClicked(View textView) {
        TextView title = (TextView) textView;
        Log.d("Title was clicked", title.getText().toString());

    }

//    public void artistClicked(View textView) {
//        TextView artist = (TextView) textView;
//        Log.d("Artist was clicked", artist.getText());
//    }

}
