package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi5Activity extends AppCompatActivity {
    private WebView materi5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi5);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);


      materi5 = findViewById(R.id.materi5);
        materi5.getSettings().setLoadsImagesAutomatically(true);
        materi5.getSettings().setJavaScriptEnabled(true);
        materi5.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi5.getSettings().setSupportZoom(true);
        materi5.getSettings().setBuiltInZoomControls(true);
        materi5.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi5.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi5.setWebViewClient(new WebViewClient());
        materi5.loadUrl("https://hamidahlaily.github.io/materi5/mobile/index.html");
        WebSettings webSettings = materi5.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi5.canGoBack()) {
            materi5.goBack();
        } else {
            super.onBackPressed();
        }
    }
}