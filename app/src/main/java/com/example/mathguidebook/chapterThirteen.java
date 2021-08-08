package com.example.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chapterThirteen extends AppCompatActivity {

    LinearLayout thirteen_one,thirteen_two;
    String chapter1 = "https://drive.google.com/file/d/108Xj7EHLF_9ZyPNVsho-DIIf8v58n3lO/view?usp=sharing";
    String chapter2 = "https://drive.google.com/file/d/1Q-xgL8kK4cFnCClWZhVgn4f8Xyjj2gST/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_thirteen);

        thirteen_one = findViewById(R.id.thirteen_part_one);
        thirteen_two = findViewById(R.id.thirteen_part_two);

        thirteen_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter1);
                intent.putExtra("Number","13");
                startActivity(intent);
            }
        });

        thirteen_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter2);
                intent.putExtra("Number","13");
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