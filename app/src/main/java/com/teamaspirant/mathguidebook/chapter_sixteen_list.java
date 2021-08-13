package com.teamaspirant.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chapter_sixteen_list extends AppCompatActivity {

    LinearLayout one,two,three,four;
    String chapter1 = "https://drive.google.com/file/d/1ogv_E-qxjltL-7UC_d2WH70CrNElt79z/view?usp=sharing";
    String chapter2 = "https://drive.google.com/file/d/1XYa4IR1KULzRHJSdFBPzmU2bBkKR1PKG/view?usp=sharing";
    String chapter3 = "https://drive.google.com/file/d/1lVN0c2idoO6LDyfKHhE_lHQnj45O6xT9/view?usp=sharing";
    String chapter4 = "https://drive.google.com/file/d/1P4AJtSqrxqeeIlOZOYDJU-UfByF_j9X5/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_sixteen_list);

        one = findViewById(R.id.sixteen_one);
        two = findViewById(R.id.sixteen_two);
        three = findViewById(R.id.sixteen_three);
        four = findViewById(R.id.sixteen_four);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter1);
                intent.putExtra("Number","16");
                startActivity(intent);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter2);
                intent.putExtra("Number","16");
                startActivity(intent);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter3);
                intent.putExtra("Number","16");
                startActivity(intent);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CommonActivity.class);
                intent.putExtra("Selected",chapter4);
                intent.putExtra("Number","16");
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