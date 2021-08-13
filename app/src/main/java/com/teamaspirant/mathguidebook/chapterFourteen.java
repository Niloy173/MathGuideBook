package com.teamaspirant.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chapterFourteen extends AppCompatActivity {

    LinearLayout one,two;
    String chapter1  = "https://drive.google.com/file/d/1wjjKxLlQl9eboQfqbD9f9xFAksKZyaUW/view?usp=sharing";
    String chapter2 = "https://drive.google.com/file/d/1LPS7w2QGAzqLT_QDuewDj7tXcAP_F-G1/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_fourteen);

        one = findViewById(R.id.fourteen_one);
        two = findViewById(R.id.fourteen_two);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter1);
                intent.putExtra("Number","14");
                startActivity(intent);

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter2);
                intent.putExtra("Number","14");
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