package com.aplicativo.gustavokumasawa.buttonandanimageapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    ImageView downloadedImage;

    public void downloadImage(View view) {

        ImageDownloader task = new ImageDownloader();

        Bitmap myImage;

        try {

            myImage = task.execute("http://www.utfpr.edu.br/cornelioprocopio/estrutura-universitaria/coordenadorias-de-gestao/coordenadoria-de-gestao-de-tecnologia-da-informacao/menu-antigo/downloads/imagens/logo%20UTFPR.jpg/download").get();

            downloadedImage.setImageBitmap(myImage);

        } catch (Exception e) {

            e.printStackTrace();

        }

        //http://www.utfpr.edu.br/cornelioprocopio/estrutura-universitaria/coordenadorias-de-gestao/coordenadoria-de-gestao-de-tecnologia-da-informacao/menu-antigo/downloads/imagens/logo%20UTFPR.jpg/download

        Log.i("Message", "Button pressed");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        downloadedImage = (ImageView) findViewById(R.id.imageView);


    }

    public class ImageDownloader extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(String... urls) {

            try {

                URL url = new URL(urls[0]);

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.connect();

                InputStream inputStream = connection.getInputStream();

                Bitmap myBitmap = BitmapFactory.decodeStream(inputStream);

                return myBitmap;


            } catch (MalformedURLException e) {

                e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();

            }

            return null;
        }
    }
}
