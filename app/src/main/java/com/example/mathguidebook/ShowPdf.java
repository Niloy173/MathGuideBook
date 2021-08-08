package com.example.mathguidebook;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.view.Window;
import android.view.WindowManager;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;



public class ShowPdf extends AppCompatActivity  {

    WebView webView;
    String fetch_url;
    String fetch_activity_no;



    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_show_pdf);

        webView = findViewById(R.id.webview);
        fetch_url = getIntent().getStringExtra("URL");

        fetch_activity_no = getIntent().getStringExtra("ActivityNumber");


        webView.setVisibility(View.GONE);






        if(!InternetChecking.checkInternetConnection(this))
        {

                Toast.makeText(this, "ইন্টারনেট সংযোগ চালু করুন", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), ChapterActivity.class);
                startActivity(intent);

        }else
        {



            try {



                webView.getSettings().setJavaScriptEnabled(true);

                webView.loadUrl(fetch_url);

                webView.setWebViewClient(new WebViewClient()
                {




                    @Override
                    public void onPageFinished(WebView view, String url) {
                        super.onPageFinished(view, url);

//                        if(view.getTitle().equals(" "))
//                            view.reload();

                        webView.loadUrl("javascript:(function() { " +
                                "document.querySelector('[role=\"toolbar\"]').remove();})()");

                       webView.setVisibility(View.VISIBLE);







                    }




                });
            }catch(Exception e)
            {
                Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
            }


        }












    }



    @Override
    public void onBackPressed() {

                       if(fetch_activity_no.equals("1"))
                       {
                           Intent intent = new Intent(getApplicationContext(),ChapterActivity.class);
                           startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("2"))
                       {
                           Intent intent = new Intent(getApplicationContext(),chapterTwo.class);
                           startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("3"))
                       {
                           Intent intent = new Intent(getApplicationContext(),chapter_three_list.class);
                           startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("4"))
                       {
                           Intent intent = new Intent(getApplicationContext(),chapterFour.class);
                           startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("5"))
                       {
                           Intent intent = new Intent(getApplicationContext(),chapterFive.class);
                           startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("6"))
                       {
                           Intent intent = new Intent(getApplicationContext(),chapterSix.class);
                           startActivity(intent);
                       }

                       else if(fetch_activity_no.equals("7"))
                       {
                           Intent intent = new Intent(getApplicationContext(),chapterSeven.class);
                           startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("8"))
                       {
                           Intent intent = new Intent(getApplicationContext(),chapter_eight_list.class);
                           startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("9"))
                       {
                           Intent intent = new Intent(getApplicationContext(),chapterNine.class);
                           startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("10"))
                       {
                           Intent intent = new Intent(getApplicationContext(),ChapterActivity.class);
                           startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("11"))
                       {
                           Intent intent = new Intent(getApplicationContext(),chapterEleven.class);
                           startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("12"))
                       {
                            Intent intent = new Intent(getApplicationContext(),chapterTweleve.class);
                            startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("13"))
                       {
                           Intent intent = new Intent(getApplicationContext(),chapterThirteen.class);
                           startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("14"))
                       {
                           Intent intent = new Intent(getApplicationContext(),chapterFourteen.class);
                           startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("15"))
                       {
                           Intent intent = new Intent(getApplicationContext(),ChapterActivity.class);
                           startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("16"))
                       {
                           Intent intent = new Intent(getApplicationContext(),chapter_sixteen_list.class);
                           startActivity(intent);
                       }
                       else if(fetch_activity_no.equals("17"))
                       {
                           Intent intent = new Intent(getApplicationContext(),ChapterActivity.class);
                           startActivity(intent);
                       }




    }
}