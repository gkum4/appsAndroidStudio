package com.aplicativo.gustavokumasawa.eggtimer;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mplayer;

    TextView secondsView;
    TextView minutesView;

    CountDownTimer myCountDownTimer;

    long tempo = 120;

    public void clicked(View view)
    {
        myCountDownTimer.cancel();
        ImageView eggImageView = (ImageView) findViewById(R.id.eggImageView);
        eggImageView.setScaleX(1f);
        eggImageView.setScaleY(1f);

        ImageView chickImageView = (ImageView) findViewById(R.id.chickImageView);
        chickImageView.setScaleX(0f);
        chickImageView.setScaleY(0f);
        if(tempo % 60 > 9)
        {
            secondsView.setText(Long.toString(tempo % 60));
        }
        else
        {
            secondsView.setText("0" + Long.toString(tempo % 60));
        }
        if(tempo/60 > 9)
        {
            minutesView.setText(Long.toString(tempo / 60) + ":");
        }
        else
        {
            minutesView.setText("0" + Long.toString(tempo / 60) + ":");
        }

    }

    public void setClicked(View view)
    {
        myCountDownTimer = new CountDownTimer(tempo * 1000, 1000)
        {
            public void onTick(long millisecondUntilDone)
            {
                long secondUntilDone = millisecondUntilDone / 1000;
                if(secondUntilDone % 60 > 9)
                {
                    secondsView.setText(Long.toString(secondUntilDone % 60));
                }
                else
                {
                    secondsView.setText("0" + Long.toString(secondUntilDone % 60));
                }
                if(tempo/60 > 9)
                {
                    minutesView.setText(Long.toString(secondUntilDone / 60) + ":");
                }
                else
                {
                    minutesView.setText("0" + Long.toString(secondUntilDone / 60) + ":");
                }
            }
            public void onFinish()
            {
                mplayer.start();
                ImageView eggImageView = (ImageView) findViewById(R.id.eggImageView);
                eggImageView.animate().rotation(720f).scaleX(0f).scaleY(0f).setDuration(2000);

                ImageView chickImageView = (ImageView) findViewById(R.id.chickImageView);
                chickImageView.animate().rotation(720f).scaleX(1f).scaleY(1f).setDuration(4000);
            }
        }.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minutesView = (TextView) findViewById(R.id.minutesView);
        secondsView = (TextView) findViewById(R.id.secondsView);

        mplayer = MediaPlayer.create(this, R.raw.alarm);

        SeekBar timeSeekBar = (SeekBar) findViewById(R.id.timeSeekBar);
        timeSeekBar.setMax(600);
        timeSeekBar.setProgress(120);

        timeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tempo = progress;
                if(tempo % 60 > 9)
                {
                    secondsView.setText(Long.toString(tempo % 60));
                }
                else
                {
                    secondsView.setText("0" + Long.toString(tempo % 60));
                }
                if(tempo/60 > 9)
                {
                    minutesView.setText(Long.toString(tempo / 60) + ":");
                }
                else
                {
                    minutesView.setText("0" + Long.toString(tempo / 60) + ":");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }
}
