package com.teamaspirant.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chapterTweleve extends AppCompatActivity {

    LinearLayout one,two,three,four;
    String chapter1 = "https://drive.google.com/file/d/1F2OiQ4pnjZbJfywlzaP9_hh-We1qLtr7/view?usp=sharing";
    String chapter2 = "https://drive.google.com/file/d/1bp6F8eLfx8mHj7ZYtIqQD5qYoLpMayhO/view?usp=sharing";
    String chapter3 = "https://drive.google.com/file/d/1mT1Yfa84wjVG0jHR3UL1JO2Cw50Sd4TY/view?usp=sharing";
    String chapter4 = "https://drive.google.com/file/d/1-NFFfBT7a9jIvSpgNjqG2fFaawbqouWu/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_tweleve);

        one = findViewById(R.id.tweleve_one);
        two = findViewById(R.id.tweleve_two);
        three = findViewById(R.id.tweleve_three);
        four = findViewById(R.id.tweleve_four);



        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter1);
                intent.putExtra("Number","12");
                startActivity(intent);

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter2);
                intent.putExtra("Number","12");
                startActivity(intent);

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter3);
                intent.putExtra("Number","12");
                startActivity(intent);

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter4);
                intent.putExtra("Number","12");
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