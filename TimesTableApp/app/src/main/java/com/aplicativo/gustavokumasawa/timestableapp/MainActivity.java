package com.aplicativo.gustavokumasawa.timestableapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView timesTableListView;

    public void generateTimesTable(int timesTable)
    {
        ArrayList<String> lista = new ArrayList<String>();

        for(int i = 1; i < 11; i++)
        {
            lista.add(Integer.toString(timesTable * i));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        timesTableListView.setAdapter(arrayAdapter);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timesTableListView = (ListView) findViewById(R.id.timesTableView);

        final SeekBar timesTableSeekBar = (SeekBar) findViewById(R.id.seekBar);

        timesTableSeekBar.setMax(20);
        timesTableSeekBar.setProgress(10);


        timesTableSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                if(progress < 1)
                {
                    progress = 1;
                    timesTableSeekBar.setProgress(1);
                }

                generateTimesTable(progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        generateTimesTable(10);
    }
}
