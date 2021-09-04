package com.laily.newproject.UI.materi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.laily.newproject.R;

public class Materi16Activity extends AppCompatActivity {
    private WebView materi16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi16);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

     materi16 = findViewById(R.id.materi16);
        materi16.getSettings().setLoadsImagesAutomatically(true);
        materi16.getSettings().setJavaScriptEnabled(true);
        materi16.getSettings().setDomStorageEnabled(true);

        // Tiga baris di bawah ini agar laman yang dimuat dapat
        // melakukan zoom.
        materi16.getSettings().setSupportZoom(true);
        materi16.getSettings().setBuiltInZoomControls(true);
        materi16.getSettings().setDisplayZoomControls(false);
        // Baris di bawah untuk menambahkan scrollbar di dalam WebView-nya
        materi16.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materi16.setWebViewClient(new WebViewClient());
        materi16.loadUrl("https://hamidahlaily.github.io/materi16/mobile/index.html");
        WebSettings webSettings = materi16.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed() {
        if (materi16.canGoBack()) {
            materi16.goBack();
        } else {
            super.onBackPressed();
        }
    }
}