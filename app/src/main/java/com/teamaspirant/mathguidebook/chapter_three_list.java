package com.teamaspirant.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chapter_three_list extends AppCompatActivity {

    LinearLayout one,two,three,four,five;
    String chapter1 = "https://drive.google.com/file/d/10fKDCEqZ8ragFIEJtTIbWth1jjr0eZZy/view?usp=sharing/view";
    String chapter2 = "https://drive.google.com/file/d/1Onab-YAT2ojXhYtNFaewgvSYutOdcTEv/view?usp=sharing";
    String chapter3 = "https://drive.google.com/file/d/1-n9ly2aYVUxy8xz0h9h6dua0h-FbWYZ4/view?usp=sharing";
    String chapter4 = "https://drive.google.com/file/d/13Z3RtsvlraoQMFfP5kVXZuAFO4R3UOX3/view?usp=sharing";
    String chapter5 = "https://drive.google.com/file/d/1IkZxa33j98tvB7IuLBfmBwPNLm4X1rdz/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_three_list);
        one = findViewById(R.id.three_one);
        two = findViewById(R.id.three_two);
        three = findViewById(R.id.three_three);
        four = findViewById(R.id.three_four);
        five = findViewById(R.id.three_five);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter1);
                intent.putExtra("Number","3");
                startActivity(intent);

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter2);
                intent.putExtra("Number","3");
                startActivity(intent);

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter3);
                intent.putExtra("Number","3");
                startActivity(intent);

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter4);
                intent.putExtra("Number","3");
                startActivity(intent);

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter5);
                intent.putExtra("Number","3");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(),ChapterActivity.class);
        startActivity(intent);
    }
}