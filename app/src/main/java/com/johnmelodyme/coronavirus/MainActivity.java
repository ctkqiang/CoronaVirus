package com.johnmelodyme.coronavirus;
/*
* This application is created to keep
* people up to date on CORONA VIRUS
* during this epidemic event.
 */
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * @Author: John Melody Melissa
 * @Project: Corona Virus
 */

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private WebView mainpage;
    private WebSettings webSettings;
    private String URL;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        URL = "";
        mainpage = findViewById(R.id.webview);
        webSettings = mainpage.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mainpage.loadUrl(URL);
    }
}
