package com.aplicativo.gustavokumasawa.lisviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);
        final ArrayList<String> myFriends = new ArrayList<String>();

        myFriends.add("Diego");
        myFriends.add("Alisson");
        myFriends.add("Sassi");
        myFriends.add("Fabio");
        myFriends.add("Tago");
        myFriends.add("Mora");
        myFriends.add("Du");
        myFriends.add("Dani");
        myFriends.add("Varejao");
        myFriends.add("Renan");
        myFriends.add("Thiago");
        myFriends.add("Thiago");
        myFriends.add("Thiago");
        myFriends.add("Thiago");
        myFriends.add("Thiago");
        myFriends.add("Thiago");
        myFriends.add("Thiago");
        myFriends.add("Thiago");
        myFriends.add("Thiago");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.list_content, myFriends);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, myFriends.get(position), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
