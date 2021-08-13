package com.teamaspirant.mathguidebook;

import android.content.Intent;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    ProgressBar progressBar;
//    public int progress =0;
//    private final Handler hdlr = new Handler();
     Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        progressBar = findViewById(R.id.progress);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),ChapterActivity.class);
                startActivity(intent);
            }
        },2000);






//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                while (progress < 100) {
//
//                    progress += 3;
//                    hdlr.post(new Runnable() {
//                        @Override
//                        public void run() {
//
//                            progressBar.setProgress(progress);
//                        }
//                    });
//
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//                Change();
//            }
//
//        }).start();
//





    }

//    private void Change() {
//
//        Intent intent = new Intent(getApplicationContext(),ChapterActivity.class);
//        startActivity(intent);
//    }






}





