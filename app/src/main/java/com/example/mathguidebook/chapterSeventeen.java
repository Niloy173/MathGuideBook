package com.example.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.Timer;
import java.util.TimerTask;

public class chapterSeventeen extends AppCompatActivity {

    ProgressBar progressBar;
    Timer timer;
    String url = "https://drive.google.com/file/d/1O-mG_ZbFFaINE12ea6BM7tgmhJUILjqp/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_seventeen);


        progressBar = findViewById(R.id.progress_id);




        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(getApplicationContext(),ShowPdf.class);
                intent.putExtra("URL",url);
                intent.putExtra("ActivityNumber","17");
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