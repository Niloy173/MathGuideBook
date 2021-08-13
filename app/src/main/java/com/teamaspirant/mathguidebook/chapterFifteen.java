package com.teamaspirant.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class chapterFifteen extends AppCompatActivity {

    Timer timer;
    ProgressBar progressBar;
    String url = "https://drive.google.com/file/d/1M0wLteg-K3c3z05Hpyg-VOTexB4uWI43/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_fifteen);

        progressBar = findViewById(R.id.progress_id);




        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(getApplicationContext(),ShowPdf.class);
                intent.putExtra("URL",url);
                intent.putExtra("ActivityNumber","15");
                startActivity(intent);

            }
        },1000);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(),ChapterActivity.class);
        startActivity(intent);
    }
}