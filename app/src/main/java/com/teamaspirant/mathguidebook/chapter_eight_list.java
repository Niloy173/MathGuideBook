package com.teamaspirant.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chapter_eight_list extends AppCompatActivity {

    LinearLayout one,two,three,four,five;

    String chapter1 = "https://drive.google.com/file/d/1-uU9-aHFqIUBETBGOG4t1qVdKxRum7A1/view?usp=sharing";
    String chapter2 = "https://drive.google.com/file/d/14cqLnwYg_AjLZkC1qCNt5mbGwr90zkJV/view?usp=sharing";
    String chapter3 = "https://drive.google.com/file/d/16MVVS4c1YXHrfBOx5sRURMxFEGQThHiG/view?usp=sharing";
    String chapter4 = "https://drive.google.com/file/d/1OCywT0_sw5v-ONU0o6OmgvZTXmLw_t4O/view?usp=sharing";
    String chapter5 = "https://drive.google.com/file/d/1QEbKt-83w5GtJjMYZ9cQ_UtV2eB1kmH6/view?usp=sharing\n";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_eight_list);

        one = findViewById(R.id.eight_one);
        two = findViewById(R.id.eight_two);
        three = findViewById(R.id.eight_three);
        four = findViewById(R.id.eight_four);
        five = findViewById(R.id.eight_five);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter1);
                intent.putExtra("Number","8");
                startActivity(intent);

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter2);
                intent.putExtra("Number","8");
                startActivity(intent);

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter3);
                intent.putExtra("Number","8");
                startActivity(intent);

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter4);
                intent.putExtra("Number","8");
                startActivity(intent);

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter5);
                intent.putExtra("Number","8");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent in = new Intent(getApplicationContext(),ChapterActivity.class);
        startActivity(in);
    }
}