package com.teamaspirant.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chapterFour extends AppCompatActivity {

    LinearLayout chapter_four_one,chapter_four_two,chapter_four_three;
    String chapter1 = "https://drive.google.com/file/d/1SCTz0Z1iAcdSty0C8p00E8lXsMXn5U88/view?usp=sharing";
    String chapter2 = "https://drive.google.com/file/d/1PrUUf7Zz6OB0hnzW22A7htftO6wjSQHm/view?usp=sharing";
    String chapter3 = "https://drive.google.com/file/d/1lgC3Qzg1AsDxTqF7k1MWAWdnRJ5DIf8z/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_four);

        chapter_four_one = findViewById(R.id.four_one);
        chapter_four_two = findViewById(R.id.four_two);
        chapter_four_three = findViewById(R.id.four_three);


        chapter_four_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter1);
                intent.putExtra("Number","4");
                startActivity(intent);
            }
        });

        chapter_four_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter2);
                intent.putExtra("Number","4");
                startActivity(intent);
            }
        });


        chapter_four_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter3);
                intent.putExtra("Number","4");
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