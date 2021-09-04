package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi4Activity extends AppCompatActivity {
    private WebView materi4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi4);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);


        materi4 = findViewById(R.id.materi4);
        materi4.getSettings().setLoadsImagesAutomatically(true);
        materi4.getSettings().setJavaScriptEnabled(true);
        materi4.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi4.getSettings().setSupportZoom(true);
        materi4.getSettings().setBuiltInZoomControls(true);
        materi4.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi4.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi4.setWebViewClient(new WebViewClient());
        materi4.loadUrl("https://hamidahlaily.github.io/materi4/mobile/index.html");
        WebSettings webSettings = materi4.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi4.canGoBack()) {
            materi4.goBack();
        } else {
            super.onBackPressed();
        }
    }
}