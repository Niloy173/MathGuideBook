package com.example.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chapterSeven extends AppCompatActivity {

    LinearLayout seven_one,seven_two;
    String chapter1 = "https://drive.google.com/file/d/1ewoIX8__6JnlGM6NDrx_5spnoBIWoeSz/view?usp=sharing";
    String chapter2 = "https://drive.google.com/file/d/1M1l1R1Yhb51p3jhn5twiZBqScIds_xm5/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_seven);

        seven_one = findViewById(R.id.seven_one);
        seven_two = findViewById(R.id.seven_two);


        seven_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(),CommonActivity.class);
                in.putExtra("Selected",chapter2);
                in.putExtra("Number","7");
                startActivity(in);
            }
        });


        seven_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(),CommonActivity.class);
                in.putExtra("Selected",chapter1);
                in.putExtra("Number","7");
                startActivity(in);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(),ChapterActivity.class);
        startActivity(intent);
    }
}