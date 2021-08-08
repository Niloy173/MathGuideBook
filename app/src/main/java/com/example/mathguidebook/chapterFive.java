package com.example.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chapterFive extends AppCompatActivity {

    LinearLayout chapter_five_one,chapter_five_two;
    String chapter1 = "https://drive.google.com/file/d/1aqdIofksVVIByJK-s9hxiMYuQvbEezau/view?usp=sharing";
    String chapter2 = "https://drive.google.com/file/d/1yKgf2M8dRZZWBbP4R7Lp6gwMM9PEd8TP/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_five);

        chapter_five_one = findViewById(R.id.five_one);
        chapter_five_two = findViewById(R.id.five_two);

        chapter_five_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter1);
                intent.putExtra("Number","5");
                startActivity(intent);

            }
        });

        chapter_five_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter2);
                intent.putExtra("Number","5");
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