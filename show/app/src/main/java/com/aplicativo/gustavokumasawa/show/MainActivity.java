package com.aplicativo.gustavokumasawa.show;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout menu;

    int i = 0;

    public void clicked(View view)
    {
        if(i % 2 == 0) {
            menu.animate().translationXBy(1000f).setDuration(500);
        }
        if(i % 2 != 0) {
            menu.animate().translationXBy(-1000f).setDuration(500);
        }
        i++;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = (LinearLayout) findViewById(R.id.menu);

        menu.setTranslationX(-1000f);

    }

}
