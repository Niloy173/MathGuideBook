package com.example.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chapterNine extends AppCompatActivity {

    LinearLayout chapter_one,chapter_two;
    String chapter1 = "https://drive.google.com/file/d/1OHPWXyVt32LNYPpSCJKjnBHijon6vxNJ/view?usp=sharing";
    String chapter2 = "https://drive.google.com/file/d/1BNkNELwUYVnQEHwOF5s426azFesTye24/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_nine);

        chapter_one = findViewById(R.id.nine_one);
        chapter_two = findViewById(R.id.nine_two);


        chapter_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter1);
                intent.putExtra("Number","9");
                startActivity(intent);
            }
        });

        chapter_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter2);
                intent.putExtra("Number","9");
                startActivity(intent);

            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(),ChapterActivity.class);
        startActivity(intent);
    }
}