package com.gustavokumasawa.u;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public void hideMenu(View view)
    {
        LinearLayout menu = (LinearLayout) findViewById(R.id.menu);
        Button hideMenuButton = (Button) findViewById(R.id.hideMenuButton);
        Button showMenuButtton = (Button) findViewById(R.id.showMenuButton);

        menu.animate().translationXBy(-1000f).setDuration(500);

        hideMenuButton.setEnabled(false);
        showMenuButtton.setEnabled(true);
    }

    public void showMenu(View view)
    {
        LinearLayout menu = (LinearLayout) findViewById(R.id.menu);
        Button hideMenuButton = (Button) findViewById(R.id.hideMenuButton);
        Button showMenuButtton = (Button) findViewById(R.id.showMenuButton);

        menu.animate().translationXBy(1000f).setDuration(500);

        hideMenuButton.setEnabled(true);
        showMenuButtton.setEnabled(false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View imagemInicio = (View) findViewById(R.id.imagemInicio);

        imagemInicio.animate().setStartDelay(1500).alpha(0f).setDuration(1000);

        LinearLayout menu = (LinearLayout) findViewById(R.id.menu);

        menu.setTranslationX(-1000f);
    }
}
