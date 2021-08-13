package com.teamaspirant.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chapterTwo extends AppCompatActivity {

    LinearLayout chapter_two_one,chapter_two_two;
    String chapter1 = "https://drive.google.com/file/d/1oZzLtPVDWlt3I5uEnljFCdZJZTgjiL0j/view?usp=sharing";
    String chapter2 = "https://drive.google.com/file/d/1R9IfbnsUu6TUu3BVwfWKgUhVzpRExiCP/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_two);


        chapter_two_one = findViewById(R.id.two_one);
        chapter_two_two = findViewById(R.id.two_two);


        chapter_two_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter1);
                intent.putExtra("Number","2");
                startActivity(intent);
            }
        });

        chapter_two_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter2);
                intent.putExtra("Number","2");
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