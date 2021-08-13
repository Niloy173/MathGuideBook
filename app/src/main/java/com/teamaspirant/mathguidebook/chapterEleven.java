package com.example.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chapterEleven extends AppCompatActivity {

    LinearLayout eleven_one,eleven_two;
    String one="https://drive.google.com/file/d/1HnZlaDwUCN_JnCGDy1HFcS16_67vVggR/view?usp=sharing";
    String two ="https://drive.google.com/file/d/1fRNbXMHCKBdvVmjvhZnEJWvY6A_UNoVe/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_eleven);
        eleven_one = findViewById(R.id.eleven_part_one);
        eleven_two = findViewById(R.id.eleven_part_two);


        eleven_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(),CommonActivity.class);
                in.putExtra("Selected",two);
                in.putExtra("Number","11");

                startActivity(in);
            }
        });

        eleven_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(),CommonActivity.class);
                in.putExtra("Selected",one);
                in.putExtra("Number","11");
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