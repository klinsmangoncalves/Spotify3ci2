package com.kmg.spotify3bi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {


    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.ivCapa);

        Glide.with(this).load("https://img.youtube.com/vi/tc-bxi26GSA/0.jpg").into(imageView);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.watermelon_sugar);
    }


    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer.start();
    }
}


