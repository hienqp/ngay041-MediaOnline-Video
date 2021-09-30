package com.hienqp.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button buttonPlay;
    VideoView videoView;

    String url = "https://khoapham.vn/download/vuoncaovietnam.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        captureViewObjectFromLayout();

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(url);
                videoView.setVideoURI(uri);
                MediaController mediaController = new MediaController(MainActivity.this);
                videoView.setMediaController(mediaController);
                videoView.start();
            }
        });
    }

    private void captureViewObjectFromLayout() {
        buttonPlay = (Button) findViewById(R.id.button_play);
        videoView = (VideoView) findViewById(R.id.videoView);
    }
}