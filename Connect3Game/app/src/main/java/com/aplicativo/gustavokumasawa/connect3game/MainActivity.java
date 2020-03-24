package com.aplicativo.gustavokumasawa.connect3game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int vez = 0;
    int posi1 = 0;
    int posi2 = 0;
    int posi3 = 0;
    int posi4 = 0;
    int posi5 = 0;
    int posi6 = 0;
    int posi7 = 0;
    int posi8 = 0;
    int posi9 = 0;

    public void restart(View view)
    {
        ImageView wCat1 = (ImageView) findViewById(R.id.whiteCat1);
        ImageView wCat2 = (ImageView) findViewById(R.id.whiteCat2);
        ImageView wCat3 = (ImageView) findViewById(R.id.whiteCat3);
        ImageView wCat4 = (ImageView) findViewById(R.id.whiteCat4);
        ImageView wCat5 = (ImageView) findViewById(R.id.whiteCat5);
        ImageView wCat6 = (ImageView) findViewById(R.id.whiteCat6);
        ImageView wCat7 = (ImageView) findViewById(R.id.whiteCat7);
        ImageView wCat8 = (ImageView) findViewById(R.id.whiteCat8);
        ImageView wCat9 = (ImageView) findViewById(R.id.whiteCat9);

        ImageView bCat1 = (ImageView) findViewById(R.id.blackCat1);
        ImageView bCat2 = (ImageView) findViewById(R.id.blackCat2);
        ImageView bCat3 = (ImageView) findViewById(R.id.blackCat3);
        ImageView bCat4 = (ImageView) findViewById(R.id.blackCat4);
        ImageView bCat5 = (ImageView) findViewById(R.id.blackCat5);
        ImageView bCat6 = (ImageView) findViewById(R.id.blackCat6);
        ImageView bCat7 = (ImageView) findViewById(R.id.blackCat7);
        ImageView bCat8 = (ImageView) findViewById(R.id.blackCat8);
        ImageView bCat9 = (ImageView) findViewById(R.id.blackCat9);

        wCat1.setTranslationY(-1000f);
        wCat2.setTranslationY(-1000f);
        wCat3.setTranslationY(-1000f);
        wCat4.setTranslationY(-1000f);
        wCat5.setTranslationY(-1000f);
        wCat6.setTranslationY(-1000f);
        wCat7.setTranslationY(-1000f);
        wCat8.setTranslationY(-1000f);
        wCat9.setTranslationY(-1000f);

        bCat1.setTranslationY(-1000f);
        bCat2.setTranslationY(-1000f);
        bCat3.setTranslationY(-1000f);
        bCat4.setTranslationY(-1000f);
        bCat5.setTranslationY(-1000f);
        bCat6.setTranslationY(-1000f);
        bCat7.setTranslationY(-1000f);
        bCat8.setTranslationY(-1000f);
        bCat9.setTranslationY(-1000f);

        vez = 0;
        posi1 = 0;
        posi2 = 0;
        posi3 = 0;
        posi4 = 0;
        posi5 = 0;
        posi6 = 0;
        posi7 = 0;
        posi8 = 0;
        posi9 = 0;

        TextView player = (TextView) findViewById(R.id.player);
        player.setText("Player: 1");

        LinearLayout layout = (LinearLayout) findViewById(R.id.end);
        layout.setVisibility(View.INVISIBLE);

    }

    public void checkPlayer()
    {
        TextView player = (TextView) findViewById(R.id.player);
        if(vez % 2 == 0)
        {
            player.setText("Player: 1");
        }
        if(vez % 2 != 0)
        {
            player.setText("Player: 2");
        }
    }
    public void checkWinPlayer()
    {
        TextView player = (TextView) findViewById(R.id.vencedor);
        LinearLayout end = (LinearLayout) findViewById(R.id.end);

        if(posi1 == 1 && posi2 == 1 && posi3 == 1)
        {
            player.setText("Player 1 Venceu!");
            end.setVisibility(View.VISIBLE);
        }
        if(posi4 == 1 && posi5 == 1 && posi6 == 1)
        {
            player.setText("Player 1 Venceu!");
            end.setVisibility(View.VISIBLE);
        }
        if(posi7 == 1 && posi8 == 1 && posi9 == 1)
        {
            player.setText("Player 1 Venceu!");
            end.setVisibility(View.VISIBLE);
        }

        if(posi1 == 1 && posi4 == 1 && posi7 == 1)
        {
            player.setText("Player 1 Venceu!");
            end.setVisibility(View.VISIBLE);
        }
        if(posi2 == 1 && posi5 == 1 && posi8 == 1)
        {
            player.setText("Player 1 Venceu!");
            end.setVisibility(View.VISIBLE);
        }
        if(posi3 == 1 && posi6 == 1 && posi9 == 1)
        {
            player.setText("Player 1 Venceu!");
            end.setVisibility(View.VISIBLE);
        }
        if(posi1 == 1 && posi5 == 1 && posi9 == 1)
        {
            player.setText("Player 1 Venceu!");
            end.setVisibility(View.VISIBLE);
        }
        if(posi7 == 1 && posi5 == 1 && posi3 == 1)
        {
            player.setText("Player 1 Venceu!");
            end.setVisibility(View.VISIBLE);
        }
        if(posi1 == 2 && posi2 == 2 && posi3 == 2)
        {
            player.setText("Player 2 Venceu!");
            end.setVisibility(View.VISIBLE);
        }
        if(posi4 == 2 && posi5 == 2 && posi6 == 2)
        {
            player.setText("Player 2 Venceu!");
            end.setVisibility(View.VISIBLE);
        }
        if(posi7 == 2 && posi8 == 2 && posi9 == 2)
        {
            player.setText("Player 2 Venceu!");
            end.setVisibility(View.VISIBLE);
        }

        if(posi1 == 2 && posi4 == 2 && posi7 == 2)
        {
            player.setText("Player 2 Venceu!");
            end.setVisibility(View.VISIBLE);
        }
        if(posi2 == 2 && posi5 == 2 && posi8 == 2)
        {
            player.setText("Player 2 Venceu!");
            end.setVisibility(View.VISIBLE);
        }
        if(posi3 == 2 && posi6 == 2 && posi9 == 2)
        {
            player.setText("Player 2 Venceu!");
            end.setVisibility(View.VISIBLE);
        }
        if(posi1 == 2 && posi5 == 2 && posi9 == 2)
        {
            player.setText("Player 2 Venceu!");
            end.setVisibility(View.VISIBLE);
        }
        if(posi7 == 2 && posi5 == 2 && posi3 == 2)
        {
            player.setText("Player 2 Venceu!");
            end.setVisibility(View.VISIBLE);
        }
    }

    public void click1(View view)
    {
        ImageView wCat1 = (ImageView) findViewById(R.id.whiteCat1);
        ImageView wCat2 = (ImageView) findViewById(R.id.whiteCat2);
        ImageView wCat3 = (ImageView) findViewById(R.id.whiteCat3);
        ImageView wCat4 = (ImageView) findViewById(R.id.whiteCat4);
        ImageView wCat5 = (ImageView) findViewById(R.id.whiteCat5);
        ImageView wCat6 = (ImageView) findViewById(R.id.whiteCat6);
        ImageView wCat7 = (ImageView) findViewById(R.id.whiteCat7);
        ImageView wCat8 = (ImageView) findViewById(R.id.whiteCat8);
        ImageView wCat9 = (ImageView) findViewById(R.id.whiteCat9);

        ImageView bCat1 = (ImageView) findViewById(R.id.blackCat1);
        ImageView bCat2 = (ImageView) findViewById(R.id.blackCat2);
        ImageView bCat3 = (ImageView) findViewById(R.id.blackCat3);
        ImageView bCat4 = (ImageView) findViewById(R.id.blackCat4);
        ImageView bCat5 = (ImageView) findViewById(R.id.blackCat5);
        ImageView bCat6 = (ImageView) findViewById(R.id.blackCat6);
        ImageView bCat7 = (ImageView) findViewById(R.id.blackCat7);
        ImageView bCat8 = (ImageView) findViewById(R.id.blackCat8);
        ImageView bCat9 = (ImageView) findViewById(R.id.blackCat9);

        if(vez % 2 == 0) //player 1
        {
            if(posi3 == 0)
            {
                posi3 = 1;
                bCat3.animate().translationYBy(1000f).setDuration(250);
            }
            else if(posi2 == 0)
            {
                posi2 = 1;
                bCat2.animate().translationYBy(1000f).setDuration(250);
            }
            else if(posi1 == 0)
            {
                posi1 = 1;
                bCat1.animate().translationYBy(1000f).setDuration(250);
            }
        }
        if(vez % 2 != 0) //player 2
        {
            if(posi3 == 0)
            {
                posi3 = 2;
                wCat3.animate().translationYBy(1000f).setDuration(250);
            }
            else if(posi2 == 0)
            {
                posi2 = 2;
                wCat2.animate().translationYBy(1000f).setDuration(250);
            }
            else if(posi1 == 0)
            {
                posi1 = 2;
                wCat1.animate().translationYBy(1000f).setDuration(250);
            }
        }
        vez++;
        checkPlayer();
        checkWinPlayer();
    }

    public void click2(View view)
    {
        ImageView wCat1 = (ImageView) findViewById(R.id.whiteCat1);
        ImageView wCat2 = (ImageView) findViewById(R.id.whiteCat2);
        ImageView wCat3 = (ImageView) findViewById(R.id.whiteCat3);
        ImageView wCat4 = (ImageView) findViewById(R.id.whiteCat4);
        ImageView wCat5 = (ImageView) findViewById(R.id.whiteCat5);
        ImageView wCat6 = (ImageView) findViewById(R.id.whiteCat6);
        ImageView wCat7 = (ImageView) findViewById(R.id.whiteCat7);
        ImageView wCat8 = (ImageView) findViewById(R.id.whiteCat8);
        ImageView wCat9 = (ImageView) findViewById(R.id.whiteCat9);

        ImageView bCat1 = (ImageView) findViewById(R.id.blackCat1);
        ImageView bCat2 = (ImageView) findViewById(R.id.blackCat2);
        ImageView bCat3 = (ImageView) findViewById(R.id.blackCat3);
        ImageView bCat4 = (ImageView) findViewById(R.id.blackCat4);
        ImageView bCat5 = (ImageView) findViewById(R.id.blackCat5);
        ImageView bCat6 = (ImageView) findViewById(R.id.blackCat6);
        ImageView bCat7 = (ImageView) findViewById(R.id.blackCat7);
        ImageView bCat8 = (ImageView) findViewById(R.id.blackCat8);
        ImageView bCat9 = (ImageView) findViewById(R.id.blackCat9);

        if(vez % 2 == 0) //player 1
        {
            if(posi6 == 0)
            {
                posi6 = 1;
                bCat6.animate().translationYBy(1000f).setDuration(250);
            }
            else if(posi5 == 0)
            {
                posi5 = 1;
                bCat5.animate().translationYBy(1000f).setDuration(250);
            }
            else if(posi4 == 0)
            {
                posi4 = 1;
                bCat4.animate().translationYBy(1000f).setDuration(250);
            }
        }
        if(vez % 2 != 0) //player 2
        {
            if(posi6 == 0)
            {
                posi6 = 2;
                wCat6.animate().translationYBy(1000f).setDuration(250);
            }
            else if(posi5 == 0)
            {
                posi5 = 2;
                wCat5.animate().translationYBy(1000f).setDuration(250);
            }
            else if(posi4 == 0)
            {
                posi4 = 2;
                wCat4.animate().translationYBy(1000f).setDuration(250);
            }
        }
        vez++;
        checkPlayer();
        checkWinPlayer();
    }

    public void click3(View view)
    {
        ImageView wCat1 = (ImageView) findViewById(R.id.whiteCat1);
        ImageView wCat2 = (ImageView) findViewById(R.id.whiteCat2);
        ImageView wCat3 = (ImageView) findViewById(R.id.whiteCat3);
        ImageView wCat4 = (ImageView) findViewById(R.id.whiteCat4);
        ImageView wCat5 = (ImageView) findViewById(R.id.whiteCat5);
        ImageView wCat6 = (ImageView) findViewById(R.id.whiteCat6);
        ImageView wCat7 = (ImageView) findViewById(R.id.whiteCat7);
        ImageView wCat8 = (ImageView) findViewById(R.id.whiteCat8);
        ImageView wCat9 = (ImageView) findViewById(R.id.whiteCat9);

        ImageView bCat1 = (ImageView) findViewById(R.id.blackCat1);
        ImageView bCat2 = (ImageView) findViewById(R.id.blackCat2);
        ImageView bCat3 = (ImageView) findViewById(R.id.blackCat3);
        ImageView bCat4 = (ImageView) findViewById(R.id.blackCat4);
        ImageView bCat5 = (ImageView) findViewById(R.id.blackCat5);
        ImageView bCat6 = (ImageView) findViewById(R.id.blackCat6);
        ImageView bCat7 = (ImageView) findViewById(R.id.blackCat7);
        ImageView bCat8 = (ImageView) findViewById(R.id.blackCat8);
        ImageView bCat9 = (ImageView) findViewById(R.id.blackCat9);

        if(vez % 2 == 0) //player 1
        {
            if(posi9 == 0)
            {
                posi9 = 1;
                bCat9.animate().translationYBy(1000f).setDuration(250);
            }
            else if(posi8 == 0)
            {
                posi8 = 1;
                bCat8.animate().translationYBy(1000f).setDuration(250);
            }
            else if(posi7 == 0)
            {
                posi7 = 1;
                bCat7.animate().translationYBy(1000f).setDuration(250);
            }
        }
        if(vez % 2 != 0) //player 2
        {
            if(posi9 == 0)
            {
                posi9 = 2;
                wCat9.animate().translationYBy(1000f).setDuration(250);
            }
            else if(posi8 == 0)
            {
                posi8 = 2;
                wCat8.animate().translationYBy(1000f).setDuration(250);
            }
            else if(posi7 == 0)
            {
                posi7 = 2;
                wCat7.animate().translationYBy(1000f).setDuration(250);
            }
        }
        vez++;
        checkPlayer();
        checkWinPlayer();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView wCat1 = (ImageView) findViewById(R.id.whiteCat1);
        ImageView wCat2 = (ImageView) findViewById(R.id.whiteCat2);
        ImageView wCat3 = (ImageView) findViewById(R.id.whiteCat3);
        ImageView wCat4 = (ImageView) findViewById(R.id.whiteCat4);
        ImageView wCat5 = (ImageView) findViewById(R.id.whiteCat5);
        ImageView wCat6 = (ImageView) findViewById(R.id.whiteCat6);
        ImageView wCat7 = (ImageView) findViewById(R.id.whiteCat7);
        ImageView wCat8 = (ImageView) findViewById(R.id.whiteCat8);
        ImageView wCat9 = (ImageView) findViewById(R.id.whiteCat9);

        ImageView bCat1 = (ImageView) findViewById(R.id.blackCat1);
        ImageView bCat2 = (ImageView) findViewById(R.id.blackCat2);
        ImageView bCat3 = (ImageView) findViewById(R.id.blackCat3);
        ImageView bCat4 = (ImageView) findViewById(R.id.blackCat4);
        ImageView bCat5 = (ImageView) findViewById(R.id.blackCat5);
        ImageView bCat6 = (ImageView) findViewById(R.id.blackCat6);
        ImageView bCat7 = (ImageView) findViewById(R.id.blackCat7);
        ImageView bCat8 = (ImageView) findViewById(R.id.blackCat8);
        ImageView bCat9 = (ImageView) findViewById(R.id.blackCat9);

        wCat1.setTranslationY(-1000f);
        wCat2.setTranslationY(-1000f);
        wCat3.setTranslationY(-1000f);
        wCat4.setTranslationY(-1000f);
        wCat5.setTranslationY(-1000f);
        wCat6.setTranslationY(-1000f);
        wCat7.setTranslationY(-1000f);
        wCat8.setTranslationY(-1000f);
        wCat9.setTranslationY(-1000f);

        bCat1.setTranslationY(-1000f);
        bCat2.setTranslationY(-1000f);
        bCat3.setTranslationY(-1000f);
        bCat4.setTranslationY(-1000f);
        bCat5.setTranslationY(-1000f);
        bCat6.setTranslationY(-1000f);
        bCat7.setTranslationY(-1000f);
        bCat8.setTranslationY(-1000f);
        bCat9.setTranslationY(-1000f);

        LinearLayout layout = (LinearLayout) findViewById(R.id.end);
        layout.setVisibility(View.INVISIBLE);
    }
}
