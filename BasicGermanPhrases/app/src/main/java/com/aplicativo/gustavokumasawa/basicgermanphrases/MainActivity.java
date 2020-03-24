package com.aplicativo.gustavokumasawa.basicgermanphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void buttonClicked(View view)
    {
        int id = view.getId();
        String buttonName = "";

        buttonName = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(buttonName, "raw", "com.aplicativo.gustavokumasawa.basicgermanphrases");

        MediaPlayer mplayer = MediaPlayer.create(this, resourceId);
        mplayer.start();

        Log.i("button clicked", buttonName);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
