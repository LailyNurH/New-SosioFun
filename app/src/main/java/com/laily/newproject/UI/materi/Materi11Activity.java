package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi11Activity extends AppCompatActivity {
    private WebView materi11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi11);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

 materi11 =  findViewById(R.id.materi11);
        materi11.getSettings().setLoadsImagesAutomatically(true);
        materi11.getSettings().setJavaScriptEnabled(true);
        materi11.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi11.getSettings().setSupportZoom(true);
        materi11.getSettings().setBuiltInZoomControls(true);
        materi11.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi11.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi11.setWebViewClient(new WebViewClient());
        materi11.loadUrl("https://hamidahlaily.github.io/materi11/mobile/index.html");
        WebSettings webSettings = materi11.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi11.canGoBack()) {
            materi11.goBack();
        } else {
            super.onBackPressed();
        }
    }
}