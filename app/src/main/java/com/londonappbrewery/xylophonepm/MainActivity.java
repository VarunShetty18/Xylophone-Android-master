package com.londonappbrewery.xylophonepm;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button2;
    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View button102 = findViewById(R.id.c_key);
        button102.setOnClickListener(this);
        View button103 = findViewById(R.id.d_key);
        button103.setOnClickListener(this);
        View button104 = findViewById(R.id.e_key);
        button104.setOnClickListener(this);
        View button105 = findViewById(R.id.f_key);
        button105.setOnClickListener(this);
        View button106 = findViewById(R.id.g_key);
        button106.setOnClickListener(this);
        View button107 = findViewById(R.id.a_key);
        button107.setOnClickListener(this);
        View button108 = findViewById(R.id.b_key);
        button108.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        // Play only one sound at a time
        if(mp != null) mp.release();

        // Find which ImageButton was pressed and take appropriate action

        switch (v.getId()) {

            case R.id.c_key:
                //Log.i("Test", "Duck Button");
                mp = MediaPlayer.create(this, R.raw.note1_c);
                break;
            case R.id.d_key:
                //Log.i("Test", "Duck Button");
                mp = MediaPlayer.create(this, R.raw.note2_d);
                break;
            case R.id.e_key:
                //Log.i("Test", "Duck Button");
                mp = MediaPlayer.create(this, R.raw.note3_e);
                break;
            case R.id.f_key:
                //Log.i("Test", "Duck Button");
                mp = MediaPlayer.create(this, R.raw.note4_f);
                break;
            case R.id.g_key:
                //Log.i("Test", "Duck Button");
                mp = MediaPlayer.create(this, R.raw.note5_g);
                break;
            case R.id.a_key:
                //Log.i("Test", "Duck Button");
                mp = MediaPlayer.create(this, R.raw.note6_a);
                break;
            case R.id.b_key:
                //Log.i("Test", "Duck Button");
                mp = MediaPlayer.create(this, R.raw.note7_b);
                break;


        }
        mp.seekTo(0);
        mp.start();
    }

    @Override
    public void onPause() {
        super.onPause();
        // Release the MediaPlayer if going into background if it isn't null
        if(mp != null) mp.release();
    }
}