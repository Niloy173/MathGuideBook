package com.teamaspirant.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ChapterActivity extends AppCompatActivity {

    LinearLayout One,two,three,four,five,six,seven,eight,nine,ten,eleven,tweleve,thirteen,fourteen,fifteen,sixteen,seventeen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);
        One = findViewById(R.id.chapter_one);
        two = findViewById(R.id.chapter_two);
        three = findViewById(R.id.chapter_three);
        four = findViewById(R.id.chapter_four);
        five = findViewById(R.id.chapter_five);
        six = findViewById(R.id.chapter_six);
        seven = findViewById(R.id.chapter_seven);
        eight = findViewById(R.id.chapter_eight);
        nine = findViewById(R.id.chapter_nine);
        ten = findViewById(R.id.chapter_ten);
        eleven = findViewById(R.id.chapter_eleven);
        tweleve = findViewById(R.id.chapter_tweleve);
        thirteen = findViewById(R.id.chapter_thirteen);
        fourteen = findViewById(R.id.chapter_fourteen);
        fifteen = findViewById(R.id.chapter_fifteen);
        sixteen = findViewById(R.id.chapter_sixteen);
        seventeen = findViewById(R.id.chapter_seventeen);

//        Single pdf starts

        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),chapterOne.class);
                startActivity(intent);

            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chapterTen.class);
                startActivity(intent);
            }
        });

        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chapterFifteen.class);
                startActivity(intent);
            }
        });

        seventeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chapterSeventeen.class);
                startActivity(intent);
            }
        });

        //single chapter pdf done


        //two part based chapter listener

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chapterTwo.class);
                startActivity(intent);
            }
        });

        sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chapter_sixteen_list.class);
                startActivity(intent);
            }
        });

        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),chapterFourteen.class);
                startActivity(intent);
            }
        });

        tweleve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),chapterTweleve.class);
                startActivity(intent);
            }
        });



        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chapterNine.class);
                startActivity(intent);
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chapter_three_list.class);
                startActivity(intent);
            }
        });

        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chapterEleven.class);
                startActivity(intent);
            }
        });

        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chapterThirteen.class);
                startActivity(intent);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(),chapterSeven.class);
                startActivity(in);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(),chapterFive.class);
                startActivity(in);
            }
        });




        //three part based work


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chapterFour.class);
                startActivity(intent);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(),chapterSix.class);
                startActivity(in);
            }
        });


        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),chapter_eight_list.class);
                startActivity(in);
            }
        });
    }


    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Exit")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);

                    }
                }).create().show();
    }



}