package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi13Activity extends AppCompatActivity {
    private WebView materi13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi13);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

     materi13 = findViewById(R.id.materi13);
        materi13.getSettings().setLoadsImagesAutomatically(true);
        materi13.getSettings().setJavaScriptEnabled(true);
        materi13.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi13.getSettings().setSupportZoom(true);
        materi13.getSettings().setBuiltInZoomControls(true);
        materi13.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi13.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi13.setWebViewClient(new WebViewClient());
        materi13.loadUrl("https://hamidahlaily.github.io/materi13/mobile/index.html");
        WebSettings webSettings = materi13.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi13.canGoBack()) {
            materi13.goBack();
        } else {
            super.onBackPressed();
        }
    }
}