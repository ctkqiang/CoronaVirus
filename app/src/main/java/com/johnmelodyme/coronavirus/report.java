package com.johnmelodyme.coronavirus;

/*
 * This application is created to keep
 * people up to date on CORONA VIRUS
 * during this epidemic event.
 */

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * @Author: John Melody Melissa
 * @Project: Corona Virus
 * @Inpired : By GF
 */

public class report extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private WebView INF;
    private String URL;
    private WebSettings webSettings;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        Log.w(TAG, "Corona" + "REPORT PAGE ===> {YES}");
        INF = findViewById(R.id.info_WEB);
        URL = "https://github.com/johnmelodyme/CoronaVirus/blob/master/20200123-sitrep-3-2019-ncov.pdf";
        //https://www.who.int/docs/default-source/coronaviruse/situation-reports/20200121-sitrep-1-2019-ncov.pdf
        webSettings = INF.getSettings();
        webSettings.setJavaScriptEnabled(true);
        INF.loadUrl(URL);
        Log.w(TAG, "Corona" + "REPORT_PDF ===> {OK}");
    }
}
