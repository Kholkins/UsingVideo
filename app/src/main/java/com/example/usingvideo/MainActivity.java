package com.example.usingvideo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.widget.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String videoSource = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4";

        //String videoSource = "android.resource://com.example.usingvideo/"+R.raw.vidos;

        videoView = (VideoView)findViewById(R.id.videoView);

        videoView.setVideoURI(Uri.parse(videoSource));
        videoView.setMediaController(new MediaController(this));

        videoView.start();

    }

}
