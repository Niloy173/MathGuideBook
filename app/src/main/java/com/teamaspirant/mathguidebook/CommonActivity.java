package com.teamaspirant.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class CommonActivity extends AppCompatActivity {

    ProgressBar progressBar;
    String url,Number;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        url = getIntent().getStringExtra("Selected");
        Number = getIntent().getStringExtra("Number");

        progressBar = findViewById(R.id.progress_id);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(getApplicationContext(),ShowPdf.class);
                intent.putExtra("URL",url);
                intent.putExtra("ActivityNumber",Number);
                startActivity(intent);

            }
        },1000);

    }
}