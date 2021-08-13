package com.teamaspirant.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chapterSix extends AppCompatActivity {

    LinearLayout six_one,six_two,six_three;

    String chapter1 = "https://drive.google.com/file/d/1Mm0uyS9EdspLwR8BldlyxB8aSNx-foa_/view?usp=sharing";
    String chapter2 = "https://drive.google.com/file/d/1qnqLIdAlCg5e2p2pxxtPf6ENd0bsqat4/view?usp=sharing";
    String chapter3 = "https://drive.google.com/file/d/1YriOYIw3kA6ye4TvmZzVGSn5DK-DicIK/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_six);

        six_one = findViewById(R.id.six_one);
        six_two = findViewById(R.id.six_two);
        six_three = findViewById(R.id.six_three);


        six_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter1);
                intent.putExtra("Number","6");
                startActivity(intent);
            }
        });

        six_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(),CommonActivity.class);
                in.putExtra("Selected",chapter2);
                in.putExtra("Number","6");
                startActivity(in);
            }
        });


        six_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter3);
                intent.putExtra("Number","6");
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