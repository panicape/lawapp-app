package com.example.lawapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

/**
 *
 * @author panicape
 * @ver 1.01 July 2022
 */
public class WebActivity extends AppCompatActivity {

    private WebView webV;


    // Methods

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webV = findViewById(R.id.webV);

        webV.loadUrl("https://google.com");
    }

}