package com.example.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.Timer;
import java.util.TimerTask;

public class chapterOne extends AppCompatActivity {




    ProgressBar progressBar;
    String url = "https://drive.google.com/file/d/1NbcJq9cCqMzFGH1L4GryONd9BJP-LXd4/view?usp=sharing";
    Timer timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_one);

//        pdfView = findViewById(R.id.chapter_one_pdfView);
//        pdfView.setMaxZoom(100);
//        pdfView.setMidZoom(80);
//        pdfView.setMinZoom(60);
//
//        pdfView.fromAsset("New Document.pdf")
//                .swipeHorizontal(false)
//                .enableDoubletap(true)
//                .spacing(1)
//                .defaultPage(0)
//                .enableSwipe(true)
//                .onPageError((page, t) -> Toast.makeText(getApplicationContext(),"Error opening page",Toast.LENGTH_SHORT).show())
//                .onRender((nbPages, pageWidth, pageHeight) -> pdfView.fitToWidth())
//
//                .load();

        progressBar = findViewById(R.id.progress_id);




        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(getApplicationContext(),ShowPdf.class);
                intent.putExtra("URL",url);
                intent.putExtra("ActivityNumber","1"); //used in OnBackpressed method in ShowPdf activity
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
