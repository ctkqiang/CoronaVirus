package com.johnmelodyme.coronavirus;
/*
* This application is created to keep
* people up to date on CORONA VIRUS
* during this epidemic event.
 */
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

/**
 * @Author: John Melody Melissa
 * @Project: Corona Virus
 * @Inpired : By GF
 */

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private WebView mainpage;
    private WebSettings webSettings;
    private String URL;
    private Button HOME, INFO;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // DECLARATION :
        HOME = findViewById(R.id.home);
        INFO = findViewById(R.id.info);

        Log.w(TAG, "Corona" + "APPLICATION STARTED");
        URL = "https://www.who.int/health-topics/coronavirus";
        mainpage = findViewById(R.id.webview);
        webSettings = mainpage.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mainpage.loadUrl(URL);
        Log.w(TAG, "Corona" + "WEBPAGE ===> {OK}");

        HOME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HOME;
                HOME = new Intent(MainActivity.this, MainActivity.class);
                startActivity(HOME);
                Log.w(TAG, "Corona" + "HOME BUTTON CLICKED ===> {YES}");
            }
        });

        INFO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent INFO;
                INFO = new Intent(MainActivity.this, report.class);
                startActivity(INFO);
                Log.w(TAG, "Corona" + "INFO BUTTON CLICKED ===> {YES}");
            }
        });

    }
}
